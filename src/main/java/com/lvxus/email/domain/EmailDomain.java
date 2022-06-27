package com.lvxus.email.domain;

import lombok.Data;

@Data
public class EmailDomain {
    private String name;
    private String mail;
    private String password;
    private String receiver;
    private String sendBy;

}
