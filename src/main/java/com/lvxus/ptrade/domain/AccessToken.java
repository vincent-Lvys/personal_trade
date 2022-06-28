package com.lvxus.ptrade.domain;

import lombok.Data;

/**
 * @author lvxus
 */
@Data
public class AccessToken {
    private String corpid;
    private String corpsecret;
    private String accessToken;
    private Integer expiresIn;

}
