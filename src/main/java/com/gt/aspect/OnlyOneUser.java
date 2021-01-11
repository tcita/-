package com.gt.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//单例
@Aspect
//@Aspect:作用是把当前类标识为一个切面供容器读取
//是一个动态代理，把一些常用功能如权限检查、日志、事务等，从每个业务方法中剥离出来。
//对调用方法进行拦截，并在拦截前后进行安全检查、日志、事务等处理，就相当于完成了所有业务功能
public class OnlyOneUser {

    @Before
    //@Before – 表示在任意使用@Test注解标注的public void方法执行之前执行
            // 执行任何定义在com.gt.controller.UserController.login包中的方法：
            (value = "execution(* com.gt.controller.UserController.login(..))")
    public void isExit(){

    }
}
