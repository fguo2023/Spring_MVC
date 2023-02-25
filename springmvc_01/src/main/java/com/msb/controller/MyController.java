package com.msb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/msb")
public class MyController {
    // 定义处理请求方法
    // 返回值定义String， 用来表明界面要跳转的页面路径
//    @RequestMapping("/firstController.do")
//    public String firstController(HttpServletRequest req){
//        System.out.println("firstController");
//        return "first";
//    }

    public String test(){
        return"";
    }

}
