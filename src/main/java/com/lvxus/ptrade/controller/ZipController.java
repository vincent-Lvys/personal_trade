package com.lvxus.ptrade.controller;

import com.lvxus.ptrade.utils.ZipFileUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/zip")
public class ZipController {

    @GetMapping("/zipMethod")
    public String zipMethod(HttpServletResponse response){
        String content = "xxxxxxxxx";
        String zipPath = "测试.txt";
        ZipFileUtil.zip(content,zipPath,response);
        return "压缩成功!!";
    }
    @GetMapping("/zipsMethod")
    public String zipsMethod(HttpServletResponse response){
        String content = "xxxxxxxxx";
        String zipPath = "测试.txt";
        Map<String, String> map = new HashMap<>();
        map.put("测试1.txt","xxxxxxxxx");
        map.put("测试2.txt","yyyyyyyyy");
        ByteArrayOutputStream byteArrayOutputStream = ZipFileUtil.zipFiles(map, response);
        ZipFileUtil.zipDownload(byteArrayOutputStream,response);
        return "压缩成功!!";
    }
}
