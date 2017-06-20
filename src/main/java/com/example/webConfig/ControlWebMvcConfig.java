package com.example.webConfig;

import com.example.interceptor.ControlWebInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

/**
 * Created by Administrator on 2017/6/12 0012.
 */
@Configuration
//@EnableWebMvc
public class ControlWebMvcConfig extends WebMvcConfigurerAdapter {
    /**
     * 配置静态访问资源
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //自定义项目内目录
        registry.addResourceHandler("/my/**").addResourceLocations("classpath:/my/");
        //指向外部目录
        //registry.addResourceHandler("/my/**").addResourceLocations("file:E:/my/");
        super.addResourceHandlers(registry);
    }

    /**
     * 以前要访问一个页面需要先创建个Controller控制类，再写方法跳转到页面
     * 在这里配置后就不需要那么麻烦了，直接访问http://localhost:8080/toLogin就跳转到login.jsp页面了
     * @param registry
     * 并不会覆盖WebMvcAutoConfiguration中的addViewControllers（在此方法中，Spring Boot将“/”映射至index.html）
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/toLogin").setViewName("login");
        super.addViewControllers(registry);
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new ControlWebInterceptor()).addPathPatterns("/**").excludePathPatterns("/toLogin","/login");
        super.addInterceptors(registry);
    }
}


