package com.lvxus.email.service;

import com.lvxus.email.PersonalTradeApplication;
import com.lvxus.email.entity.JslData;
import com.lvxus.email.service.impl.JslDataCatchServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = PersonalTradeApplication.class)
public class JslDataCatchServiceImplTest {

    @Autowired
    private JslDataCatchServiceImpl jslDataCatchService;
    @Test
    public void should_return_jsl_data_list(){

        List<JslData> dataList = jslDataCatchService.getDataList();
        Assert.assertNotNull(dataList);
    }
}
