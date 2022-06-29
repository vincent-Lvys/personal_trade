package com.lvxus.ptrade.controller;

import com.alibaba.fastjson.JSONObject;
import com.lvxus.ptrade.domain.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lvxus
 */
@RestController
@RequestMapping("/wx")
public class WxMessageController {

    @GetMapping("/breachRemind")
    public Result breachRemind(){
        JSONObject data = new JSONObject();
        return Result.success("提醒成功").data(data);
    }
}
