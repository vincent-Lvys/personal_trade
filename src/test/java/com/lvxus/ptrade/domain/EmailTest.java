package com.lvxus.ptrade.domain;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class EmailTest {


    @Test
    public void testSetName() throws Exception {
        Email email = new Email();
        email.setTitle("1");
        email.setReceiveBy("1");
        email.setPassword("1");
        email.setReceiveBy("1");
        email.setSendBy("1");
        Object emailDomain2 = new Object();
        emailDomain2.equals(email);
        email.equals(emailDomain2);
        Email email3 = new Email();
        email3.setTitle(null);
        email3.setReceiveBy(null);
        email3.setPassword(null);
        email3.setReceiveBy(null);
        email3.setSendBy(null);
        email3.equals(email3);
        email3.equals(email);
        email.hashCode();
        email3.hashCode();
        email.toString();




    }

}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme