package com.lvxus.email.domain;

import lombok.Data;

/**
 * @author lvxus
 */
@Data
public abstract class BaseMessage {
    private String touser;
    private String toparty;
    private String totag;
    private String msgtype;
    private String agentid;


}
