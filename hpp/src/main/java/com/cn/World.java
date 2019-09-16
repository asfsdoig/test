package com.cn;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class World extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
        PrintWriter writer=response.getWriter();
        writer.println("<html><body>");
        writer.println("<h1>"+"hello"+"</h1>");
        writer.println("</body></html>");}
}
