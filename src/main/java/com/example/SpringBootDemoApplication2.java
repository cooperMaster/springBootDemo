package com.example;

import com.example.dto.ConfigBean;
import com.example.dto.ConfigRandomBean;
import com.example.dto.ConfigTestBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


@SpringBootApplication
@EnableAutoConfiguration
@EnableConfigurationProperties({ConfigBean.class, ConfigTestBean.class,ConfigRandomBean.class})
public class SpringBootDemoApplication2 {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication2.class, args);
	}
}
