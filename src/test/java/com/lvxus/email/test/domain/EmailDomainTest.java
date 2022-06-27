package com.lvxus.email.test.domain;

import com.lvxus.email.domain.EmailDomain;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class EmailDomainTest {


    @Test
    public void testSetName() throws Exception {
        EmailDomain emailDomain = new EmailDomain();
        emailDomain.setName("1");
        emailDomain.setMail("1");
        emailDomain.setPassword("1");
        emailDomain.setReceiver("1");
        emailDomain.setSendBy("1");
        Object emailDomain2 = new Object();
        emailDomain2.equals(emailDomain);
        emailDomain.equals(emailDomain2);
        EmailDomain emailDomain3 = new EmailDomain();
        emailDomain3.setName(null);
        emailDomain3.setMail(null);
        emailDomain3.setPassword(null);
        emailDomain3.setReceiver(null);
        emailDomain3.setSendBy(null);
        emailDomain3.equals(emailDomain3);
        emailDomain3.equals(emailDomain);
        emailDomain.hashCode();
        emailDomain3.hashCode();
        emailDomain.toString();




    }

}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme