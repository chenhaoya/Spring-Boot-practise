/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/26 18:22
 * 开发名称：HelloController
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package com.hao.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    /** 这里是一个接口 ：http://localhost:8080/hello */
    @RequestMapping("/hello")
    public String hello(){
        //调用业务接收前端参数
        return "hello,word";
    }
}