package com.example.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by Administrator on 2017/6/3 0003.
 */
@Configuration
@ConfigurationProperties(prefix = "com.example")
@PropertySource("classpath:test.properties")
public class ConfigTestBean {
    private String d;
    private String e;

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    public String getE() {
        return e;
    }

    public void setE(String e) {
        this.e = e;
    }
}
