package com.lvxus.email.domain;

import lombok.Data;

/**
 * @author lvxus
 */
@Data
public class WxMessage {
    private String touser;
    private String toparty;
    private String totag;
    private String msgtype;
    private String agentid;
    private TextMessage textMessage;


}
