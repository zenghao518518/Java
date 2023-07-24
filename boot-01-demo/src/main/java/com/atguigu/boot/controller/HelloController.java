package com.atguigu.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    //java -jar boot-01-demo-1.0-SNAPSHOT.jar
    //解决方法：1、下载并安装jdk；2、在环境变量界面中，将“JAVA_HOME”配置路径写全，“CLASSPATH”配置路径里写上“.;%JAVA_HOME%\lib;”，“PATH”配置路径里写上“%JAVA_HOME%\bin;”即可
    @GetMapping("/hello")
    public String hello(){

        return "Hello,Spring Boot 3!";
    }

}