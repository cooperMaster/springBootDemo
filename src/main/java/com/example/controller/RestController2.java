package com.example.controller;

import com.example.dto.ConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/6/3 0003.
 */
@RestController
public class RestController2 {
    @Autowired
    private ConfigBean configBean;

    @RequestMapping("/2")
    public String index(){
        return "Hello Spring Boot,welcome "+configBean.getName()+",your attr is "+configBean.getAttr();
    }

}
