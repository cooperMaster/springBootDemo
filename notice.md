* 存在requestMapping("/1") 
`当url为xxx/1.html 访问的是url为"xxx/1" 没搞懂为啥`

* JSP没有在此项目中用上，用不起来

* RequestMapping("/t")中url为`/t`,("/t/")url为`/t/`

* 当有@EnableConfigurationProperties，
`@EnableAutoConfiguration`必须存在，否则ControlWebMvcConfig不能被注解
`或在ControlWebMvcConfig中加@EnableWebMvc`
* 当为@EnableWebMvc时resources下的资源不能以url方式访问如：`http:localhost:8081`及`http:localhost:8081\test.html` 


* ControlWebMvcConfig.addInterceptors中的addPathPatterns("/**")没有过滤到`http:localhost:8081`及`http:localhost:8081/`