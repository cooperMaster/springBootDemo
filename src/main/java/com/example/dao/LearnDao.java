package com.example.dao;


import com.example.dto.LearnResource;
import com.example.tools.Page;

import java.util.Map;

/**
 * Created by tengj on 2017/4/8.
 */
public interface LearnDao {
    int add(LearnResource learnResource);
    int update(LearnResource learnResource);
    int deleteByIds(String ids);
    LearnResource queryLearnResourceById(Long id);
    Page queryLearnResourceList(Map<String, Object> params);
}
