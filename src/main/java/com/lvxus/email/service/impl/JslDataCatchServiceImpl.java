package com.lvxus.email.service.impl;

import com.lvxus.email.dao.JslDataDao;
import com.lvxus.email.entity.JslData;
import com.lvxus.email.service.JslDataCatchService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author lvxus
 */
@Service("jslDataCatchService")
public class JslDataCatchServiceImpl implements JslDataCatchService {
    @Resource
    private JslDataDao jslDataDao;

    @Override
    public List<JslData> getDataList() {
        List<JslData> jslDataList = jslDataDao.findAll();
        return jslDataList.stream().sorted(Comparator.comparing(JslData::getDblow)).collect(Collectors.toList());
    }
}
