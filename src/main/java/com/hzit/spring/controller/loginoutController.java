package com.hzit.spring.controller;

import com.hzit.spring.listern.CountOnlineListener;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

@WebServlet(urlPatterns = "/loginout")
public class loginoutController extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html charset");


        req.getSession().invalidate();//
        resp.getWriter().println("退出登录");
        ConcurrentHashMap hashMap= CountOnlineListener.map;
        resp.getWriter().println("在线用户数"+hashMap.size());

    }
}
