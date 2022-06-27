package com.lvxus.email.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Maps;
import com.lvxus.email.domain.AccessToken;
import com.lvxus.email.domain.TextMessage;
import com.lvxus.email.service.BaseMessageSendService;
import com.lvxus.email.utils.HttpUtils;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@Slf4j
@Service("wxMessageSendService")
public class WxMessageSendServiceImpl implements BaseMessageSendService {
    @Resource
    private RedisTemplate redisTemplate;

    @Value("${wx.access.token.corpid}")
    private String corpid;
    @Value("${wx.access.token.corpsecret}")
    private String corpsecret;
    @Value("${wx.message.agentid}")
    private String agentId;
    @Value("${wx.message.msgtype}")
    private String msgtype;


    @SneakyThrows
    @Override
    public AccessToken getAccessToken() {
        AccessToken accessToken = new AccessToken();
        accessToken.setCorpid(corpid);
        accessToken.setCorpsecret(corpsecret);
        if (redisTemplate.hasKey("access_token")){
            accessToken.setAccessToken(String.valueOf(redisTemplate.opsForValue().get("access_token")));
            return accessToken;
        }
        String url = "https://qyapi.weixin.qq.com/cgi-bin/gettoken";
        Map<String, Object> params = Maps.newHashMap();
        params.put("corpid",accessToken.getCorpid());
        params.put("corpsecret",accessToken.getCorpsecret());
        CloseableHttpResponse response = HttpUtils.doGet(url, params);
        JSONObject jsonObject = JSONObject.parseObject(EntityUtils.toString(response.getEntity()));
        accessToken.setAccessToken(jsonObject.getString("access_token"));
        accessToken.setExpiresIn(jsonObject.getInteger("expires_in"));
        if (jsonObject.getInteger("errcode") != 0){
            log.error(jsonObject.getString("errmsg"));
        }
        redisTemplate.opsForValue().set("access_token",accessToken.getAccessToken(),accessToken.getExpiresIn(), TimeUnit.SECONDS);
        return accessToken;
    }

    @SneakyThrows
    @Override
    public void sendMessage(TextMessage message) {
        message.setAgentid(agentId);
        message.setMsgtype(msgtype);
        String url = String.format("https://qyapi.weixin.qq.com/cgi-bin/message/send?access_token=%s",getAccessToken().getAccessToken());
        CloseableHttpResponse response = HttpUtils.doPost(url, message);
        JSONObject jsonObject = JSONObject.parseObject(EntityUtils.toString(response.getEntity()));
        if (jsonObject.getInteger("errcode") != 0){
            log.error(jsonObject.getString("errmsg"));
        }
    }
}
