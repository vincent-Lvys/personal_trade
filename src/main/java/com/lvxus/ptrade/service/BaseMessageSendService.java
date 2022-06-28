package com.lvxus.ptrade.service;

import com.lvxus.ptrade.domain.AccessToken;
import com.lvxus.ptrade.domain.WxMessage;

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
