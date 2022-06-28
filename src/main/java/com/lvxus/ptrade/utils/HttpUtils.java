package com.lvxus.ptrade.utils;

import com.alibaba.fastjson.JSONObject;
import lombok.SneakyThrows;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import java.util.Iterator;
import java.util.Map;

public class HttpUtils {


    @SneakyThrows
    public static CloseableHttpResponse doGet(String url, Map<String, Object> params) {
        CloseableHttpClient client = HttpClientBuilder.create().build();
        StringBuilder paramBuilder = new StringBuilder();
        if (params.size() > 0) {
            Iterator<String> iterator = params.keySet().iterator();
            while (iterator.hasNext()) {
                String key = iterator.next();
                paramBuilder.append("&").append(key).append("=").append(params.get(key));
            }
            url += paramBuilder.replace(0, 1, "?").toString();
        }
        HttpGet httpGet = new HttpGet(url);
        return client.execute(httpGet);
    }

    @SneakyThrows
    public static CloseableHttpResponse doPost(String url, Object body) {
        CloseableHttpClient client = HttpClientBuilder.create().build();
        HttpPost httpPost = new HttpPost(url);
        httpPost.addHeader("Content-Type", "application/json;charset=utf8");
        StringEntity entity = new StringEntity(JSONObject.toJSONString(body), "UTF-8");
        httpPost.setEntity(entity);
        return client.execute(httpPost);
    }
}
