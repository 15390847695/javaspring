package com.hzit.spring.controller;

import com.hzit.spring.listern.CountOnlineListener;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

@WebServlet(urlPatterns = "/login1")
public class loginController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

       resp.setCharacterEncoding("utf-8");
       resp.setContentType("text/html charset");


        String username=   req.getParameter("username");
     String password=req.getParameter("password");
     if("qwe".equals(username)&& "123".equals(password)){
        HttpSession session= req.getSession();
         ConcurrentHashMap hashMap=CountOnlineListener.map;
       // Set set =hashMap.entrySet();
         resp.getWriter().println("当前用户数量："+hashMap.size());

     }else {
          resp.getWriter().println("用户或者密码错误");
     }
    }
}
