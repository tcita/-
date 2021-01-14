package com.gt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
/*SpringMVC Controller 对象，即一个控制器类。
Spring 使用扫描机制查找应用程序中所有基于注解的控制器类。分发处理器(DispatcherServlet)
会扫描使用该注解的类的方法，并检测该方法是否使用了@RequestMapping注解
，而使用了@RequestMapping注解的方法才是真正处理请求的处理器
@RequestMapping 是 Spring Web 应用程序中最常被用到的注解之一。
这个注解会将 HTTP 请求映射到 MVC 和 REST 控制器的处理方法上。
*/
public class ErrorController {
   
    @RequestMapping(value = "/error")//http请求
    public String error() {
        return "error";
    }

}
