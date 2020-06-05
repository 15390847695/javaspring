package com.hzit.spring.util;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Myaop {
    @Pointcut("execution(* com.hzit.spring.*.*(..))")
    public  void anymethod(){

    }
    /**
     *定义一个通知
     */
    @Before("anymethod()")
    public void before(){
        System.out.println("you are xiao cui");
    }
}
