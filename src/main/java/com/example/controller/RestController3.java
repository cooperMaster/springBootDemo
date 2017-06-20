package com.example.controller;

import com.example.dto.ConfigTestBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/6/3 0003.
 */
@RestController
public class RestController3 {
    @Autowired
    private ConfigTestBean configTestBean;

    @RequestMapping("/3")
    public String index(){
        return "Hello Spring Boot,welcome "+configTestBean.getD()+",your attr is "+configTestBean.getE();
    }

}
