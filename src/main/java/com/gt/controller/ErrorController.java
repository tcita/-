package com.gt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ErrorController {
    //@RequsetMapping用在类开头，为整个类规定它的父路径。
    //在方法前使用@RequsetMapping，相当于规定该调用方法的路径。
    @RequestMapping(value = "/error")
    public String error() {
        return "error";
    }

}
