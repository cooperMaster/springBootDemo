package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/6/3 0003.
 */
@RestController
public class RestController1 {

    @Value("${com.example.name}")
    private String name;
    @Value("${com.example.attr}")
    private String attr;

    @RequestMapping("/1")//当静态资源中有1.html会跳到此，搞不懂为啥
    public String index(){
        return "Hello Spring Boot,welcome "+name+",your attr is "+attr;
    }
}
