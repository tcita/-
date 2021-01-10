package com.gt.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//单例
@Aspect
//@Aspect:作用是把当前类标识为一个切面供容器读取
public class OnlyOneUser {

    @Before
    //@Before – 表示在任意使用@Test注解标注的public void方法执行之前执行
            // 执行任何定义在com.gt.controller.UserController.login包中的方法：
            (value = "execution(* com.gt.controller.UserController.login(..))")
    public void isExit(){

    }
}
