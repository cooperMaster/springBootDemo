package com.example.service.impl;


import com.example.dao.LearnDao;
import com.example.dto.LearnResource;
import com.example.service.LearnService;
import com.example.tools.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by tengj on 2017/4/7.
 */
@Service
public class LearnServiceImpl implements LearnService {

    @Autowired
    LearnDao learnDao;
    @Override
    public int add(LearnResource learnResource) {
        return this.learnDao.add(learnResource);
    }

    @Override
    public int update(LearnResource learnResource) {
        return this.learnDao.update(learnResource);
    }

    @Override
    public int deleteByIds(String ids) {
        return this.learnDao.deleteByIds(ids);
    }


    @Override
    public LearnResource queryLearnResourceById(Long id) {
        return this.learnDao.queryLearnResourceById(id);
    }

    @Override
    public Page queryLearnResourceList(Map<String,Object> params) {
        return this.learnDao.queryLearnResourceList(params);
    }
}
