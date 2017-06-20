package com.example.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.dto.LearnResource;
import com.example.service.LearnService;
import com.example.tools.Page;
import com.example.tools.ServletUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/6/5 0005.
 */
@RestController
@RequestMapping("/learn")
public class LearnResourceController {
    @RequestMapping("")//此处若加"/" 链接一定为/learn/
    public ModelAndView index(){
        System.out.println("/learn");
        List<LearnResource> learnList =new ArrayList<LearnResource>();
        LearnResource bean =new LearnResource("官方参考文档","Spring Boot Reference Guide","http://docs.spring.io/spring-boot/docs/1.5.1.RELEASE/reference/htmlsingle/#getting-started-first-application");
        learnList.add(bean);
        bean =new LearnResource("官方SpringBoot例子","官方SpringBoot例子","https://github.com/spring-projects/spring-boot/tree/master/spring-boot-samples");
        learnList.add(bean);
        bean =new LearnResource("龙国学院","Spring Boot 教程系列学习","http://www.roncoo.com/article/detail/125488");
        learnList.add(bean);
        bean =new LearnResource("嘟嘟MD独立博客","Spring Boot干货系列 ","http://tengj.top/");
        learnList.add(bean);
        bean =new LearnResource("后端编程嘟","Spring Boot教程和视频 ","http://www.toutiao.com/m1559096720023553/");
        learnList.add(bean);
        bean =new LearnResource("程序猿DD","Spring Boot系列","http://www.roncoo.com/article/detail/125488");
        learnList.add(bean);
        bean =new LearnResource("纯洁的微笑","Spring Boot系列文章","http://www.ityouknow.com/spring-boot");
        learnList.add(bean);
        bean =new LearnResource("CSDN——小当博客专栏","Spring Boot学习","http://blog.csdn.net/column/details/spring-boot.html");
        learnList.add(bean);
        bean =new LearnResource("梁桂钊的博客","Spring Boot 揭秘与实战","http://blog.csdn.net/column/details/spring-boot.html");
        learnList.add(bean);
        bean =new LearnResource("林祥纤博客系列","从零开始学Spring Boot ","http://412887952-qq-com.iteye.com/category/356333");
        learnList.add(bean);
        ModelAndView modelAndView = new ModelAndView("//template");
        modelAndView.addObject("learnList", learnList);
        return modelAndView;
    }

    @RequestMapping("/t")//此处若加"/t/" 链接一定为/learn/t/
    public ModelAndView index2(){

        List<LearnResource> learnList =new ArrayList<LearnResource>();
        LearnResource bean =new LearnResource("官方参考文档","Spring Boot Reference Guide","http://docs.spring.io/spring-boot/docs/1.5.1.RELEASE/reference/htmlsingle/#getting-started-first-application");
        learnList.add(bean);
        bean =new LearnResource("官方SpriongBoot例子","官方SpriongBoot例子","https://github.com/spring-projects/spring-boot/tree/master/spring-boot-samples");
        learnList.add(bean);
        bean =new LearnResource("龙国学院","Spring Boot 教程系列学习","http://www.roncoo.com/article/detail/125488");
        learnList.add(bean);
        bean =new LearnResource("嘟嘟MD独立博客","Spring Boot干货系列 ","http://tengj.top/");
        learnList.add(bean);
        bean =new LearnResource("后端编程嘟","Spring Boot教程和视频 ","http://www.toutiao.com/m1559096720023553/");
        learnList.add(bean);
        bean =new LearnResource("程序猿DD","Spring Boot系列","http://www.roncoo.com/article/detail/125488");
        learnList.add(bean);
        bean =new LearnResource("纯洁的微笑","Sping Boot系列文章","http://www.ityouknow.com/spring-boot");
        learnList.add(bean);
        bean =new LearnResource("CSDN——小当博客专栏","Sping Boot学习","http://blog.csdn.net/column/details/spring-boot.html");
        learnList.add(bean);
        bean =new LearnResource("梁桂钊的博客","Spring Boot 揭秘与实战","http://blog.csdn.net/column/details/spring-boot.html");
        learnList.add(bean);
        bean =new LearnResource("林祥纤博客系列","从零开始学Spring Boot ","http://412887952-qq-com.iteye.com/category/356333");
        learnList.add(bean);
        ModelAndView modelAndView = new ModelAndView("/index");
        modelAndView.addObject("learnList", learnList);
        return modelAndView;
    }
    @Autowired
    private LearnService learnService;
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "/queryLeanList",method = RequestMethod.POST,produces="application/json;charset=UTF-8")
    @ResponseBody
    public void queryLearnList(HttpServletRequest request , HttpServletResponse response){
        String page = request.getParameter("page"); // 取得当前页数,注意这是jqgrid自身的参数
        String rows = request.getParameter("rows"); // 取得每页显示行数，,注意这是jqgrid自身的参数
        String author = request.getParameter("author");
        String title = request.getParameter("title");
        Map<String,Object> params = new HashMap<String,Object>();
        params.put("page", page);
        params.put("rows", rows);
        params.put("author", author);
        params.put("title", title);
        Page pageObj =learnService.queryLearnResourceList(params);
        List<Map<String, Object>> learnList=pageObj.getResultList();
        JSONObject jo=new JSONObject();
        jo.put("rows", learnList);
        jo.put("total", pageObj.getTotalPages());
        jo.put("records", pageObj.getTotalRows());
        ServletUtil.createSuccessResponse(200, jo, response);
    }


}