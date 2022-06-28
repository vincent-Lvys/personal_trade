package com.lvxus.email.domain;

import lombok.Data;

/**
 * @author lvxus
 */
@Data
public class Email {
    private String title;
    private String receiveBy;
    private String sendBy;
    private String password;
    private String sendTime;
    private TextMessage textMessage;

}
