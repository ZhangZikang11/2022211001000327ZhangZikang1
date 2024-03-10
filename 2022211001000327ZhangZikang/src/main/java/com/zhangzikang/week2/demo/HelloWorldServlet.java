package com.zhangzikang.week2.demo;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HelloWorldServlet extends javax.servlet.http.HttpServlet{
    private static final String NAME = "Zhang Zikang";
    private static final String ID = "2022211001000327";

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/plain");
        PrintWriter writer = response.getWriter();
        writer.println("Name: " + NAME);
        writer.println("ID: " + ID);
        writer.println("Date: " + new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
        writer.println("Time: " + new SimpleDateFormat("HH:mm:ss").format(new Date()));
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        doGet(request, response);
    }
}
