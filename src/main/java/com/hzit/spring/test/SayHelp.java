package com.hzit.spring.test;

import com.hzit.spring.bean.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SayHelp {
    private SayHelo sayHelo;
    public SayHelo getSayHelo(){
        return sayHelo;
    }
    public void setSayHelo(SayHelo sayHelo){

        this.sayHelo=sayHelo;
    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        SayHelp bean=context.getBean("SayHelp",SayHelp.class);
        System.out.println("etewtetsr");
       // bean.setSayHelo();
    }
    }

