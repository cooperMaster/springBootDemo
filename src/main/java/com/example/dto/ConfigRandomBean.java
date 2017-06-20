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
public class ConfigRandomBean {
    private String secret;
    private String number;
    private String bigNumber;
    private String uuid;

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getBigNumber() {
        return bigNumber;
    }

    public void setBigNumber(String bigNumber) {
        this.bigNumber = bigNumber;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
