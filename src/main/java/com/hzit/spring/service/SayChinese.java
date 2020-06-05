package com.hzit.spring.service;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class SayChinese implements ISayHello {
    @Override
    public void sayHello() {

        System.out.println("saychinese...............");
    }
}
