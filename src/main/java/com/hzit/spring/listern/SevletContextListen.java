package com.hzit.spring.listern;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 *
 *
 */
public class SevletContextListen implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("init。。。。。。。。。。。。。。");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("destroy...........................");
    }
}
