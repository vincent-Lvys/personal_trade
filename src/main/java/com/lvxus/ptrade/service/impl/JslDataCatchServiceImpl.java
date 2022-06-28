package com.lvxus.ptrade.service.impl;

import com.lvxus.ptrade.dao.JslDataDao;
import com.lvxus.ptrade.entity.JslData;
import com.lvxus.ptrade.service.JslDataCatchService;
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
