package com.lvxus.email.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email")
public class EmailController {

    @Autowired
    private JavaMailSender javaMailSender;

    @PostMapping("/send")
    public void send(){
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setTo("1642081361@qq.com");
        simpleMailMessage.setFrom("401598613@qq.com");
        simpleMailMessage.setSubject("这是一个测试邮件");
        simpleMailMessage.setText("this is a test email,don't reply");
        javaMailSender.send(simpleMailMessage);

    }
}
