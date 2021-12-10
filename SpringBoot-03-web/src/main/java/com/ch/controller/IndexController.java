/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/12/2 21:06
 * 开发名称：IndexController
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package com.ch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;

/**在templates目录下的所有页面，只能通过Controller来跳转！*/
/**这里需要模板引擎支持：thymeleaf*/
@Controller
public class IndexController {
    @RequestMapping("/test")
    public String index(Model model){
        model.addAttribute("mes", "<h1>hello,Model</h1>");
        model.addAttribute("mes", "<h1>hello,Model</h1>");

        model.addAttribute("users", Arrays.asList("ch", "ch1", "ch2", "ch3"));
        return "test";
    }
}