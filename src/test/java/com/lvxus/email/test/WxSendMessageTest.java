package com.lvxus.email.test;

import com.lvxus.email.domain.TextMessage;
import com.lvxus.email.service.impl.WxMessageSendServiceImpl;
import lombok.SneakyThrows;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WxSendMessageTest {

    @Autowired
    private WxMessageSendServiceImpl wxMessageSendService;

    @SneakyThrows
    @Test
    public void should_send_message(){

        TextMessage.Text text = new TextMessage.Text();
        text.setContent("吕永森");
        TextMessage message = new TextMessage();
        message.setTouser("LvYongSen");
        message.setText(text);
        wxMessageSendService.sendMessage(message);
    }
}
