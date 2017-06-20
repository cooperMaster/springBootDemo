package com.example.controller;

import com.example.dto.ConfigRandomBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/6/3 0003.
 */
@RestController
public class RestController4 {
    @Autowired
    private ConfigRandomBean configRandomBean;

    @RequestMapping("/4")
    public String index(){
        return "Hello Spring Boot,"+configRandomBean.getSecret()+","+configRandomBean.getNumber()
                +","+configRandomBean.getBigNumber()+","+configRandomBean.getUuid();
    }

}
