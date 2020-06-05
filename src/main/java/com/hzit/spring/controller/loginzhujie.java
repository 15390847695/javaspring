package com.hzit.spring.controller;

import com.hzit.spring.dao.Dbutil;
import com.hzit.spring.service.ISayHello;
import com.hzit.spring.service.Person;
import com.hzit.spring.util.limit;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
@WebServlet(urlPatterns = "/login")


public class loginzhujie  extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {

        super.init(config);

        ServletContext application = this.getServletContext();
        SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this, application);

    }

    @Autowired
    private ISayHello iSayHello;
    @Autowired
    private Dbutil dbutil;

    @Autowired
    private limit limit;

    @Autowired
    private Person person;
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {


        person.save();
//        iSayHello.sayHello();
//
//
//        dbutil.save();
    }

//    public void login(){
//
//    }
//list 元素有序，可重复
    //set除了TreeSet有序其他都无序 都不可重复
    //map 除了TreeMap 有序其它都无序 key唯一，value可重复
    //线程安全 vector hashtable concurrenthashmap stack


}
