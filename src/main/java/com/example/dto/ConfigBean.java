package com.example.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2017/6/3 0003.
 */
@ConfigurationProperties(prefix = "com.example")
public class ConfigBean {
    private String name;
    private String attr;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAttr() {
        return attr;
    }

    public void setAttr(String attr) {
        this.attr = attr;
    }
}
