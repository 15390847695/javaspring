package com.hzit.spring.listern;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class CountOnlineListener implements HttpSessionListener {


   public static ConcurrentHashMap map =new ConcurrentHashMap();
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        HttpSession session=se.getSession();
        String sessionId=session.getId();
        map.put(sessionId,session);
       // System.out.println("sessionCreated..................");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        HttpSession session=se.getSession();
        map.remove(session.getId());

        //System.out.println("sessionDestroyed.......................");
    }
}
