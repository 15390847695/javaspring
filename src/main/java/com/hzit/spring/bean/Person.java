package com.hzit.spring.bean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLOutput;

public class Person {
    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void sayHello(){
        System.out.println("hello====================");
    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Person bean=context.getBean("person",Person.class);
        System.out.println(bean.getUserName());
        bean.sayHello();
    }
//    public static void main(String[] args) {
//// 加载配置文件
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
//        Person bean = context.getBean("person", Person.class);
//        bean.sayHello();
//    }

}
