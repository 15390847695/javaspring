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


    }

