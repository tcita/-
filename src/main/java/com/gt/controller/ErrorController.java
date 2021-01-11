package com.gt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
/*SpringMVC Controller 对象，即一个控制器类。
Spring 使用扫描机制查找应用程序中所有基于注解的控制器类。分发处理器(DispatcherServlet)
会扫描使用该注解的类的方法，并检测该方法是否使用了@RequestMapping注解
，而使用了@RequestMapping注解的方法才是真正处理请求的处理器*/
public class ErrorController {
   // 在Spring MVC 中使用 @RequestMapping 来映射请求，也就是通过它来指定控制器可以处理哪些URL请求
    @RequestMapping(value = "/error")
    public String error() {
        return "error";
    }

}
