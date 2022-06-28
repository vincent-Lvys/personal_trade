package com.lvxus.email.service;

import com.lvxus.email.domain.AccessToken;
import com.lvxus.email.domain.WxMessage;

/**
 * @author lvxus
 */
public interface BaseMessageSendService {

    /**
     * @return
     */
    public AccessToken getAccessToken();

    /**
     * @param message
     */
    public void sendMessage(WxMessage message);
}
