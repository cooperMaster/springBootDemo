package com.example.service;


import com.example.dto.LearnResource;
import com.example.tools.Page;

import java.util.Map;

/**
 * Created by tengj on 2017/4/7.
 */
public interface LearnService {
    int add(LearnResource learnResource);
    int update(LearnResource learnResource);
    int deleteByIds(String ids);
    LearnResource queryLearnResourceById(Long learnResource);
    Page queryLearnResourceList(Map<String, Object> params);
}
