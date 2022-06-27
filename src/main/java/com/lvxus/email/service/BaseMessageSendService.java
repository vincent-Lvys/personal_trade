package com.lvxus.email.service;

import com.lvxus.email.domain.AccessToken;
import com.lvxus.email.domain.TextMessage;

public interface BaseMessageSendService {

    public AccessToken getAccessToken();

    public void sendMessage(TextMessage message);
}
