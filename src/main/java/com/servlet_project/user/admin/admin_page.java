package com.servlet_project.user.admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class admin_page extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
        throws ServletException, IOException {
        response.setContentType("text/html");  
        PrintWriter out = response.getWriter();  
              
        out.print("Please, login first");  
        RequestDispatcher rd=request.getRequestDispatcher("login_page.jsp");  
        rd.include(request,response);    
              
        out.close();      
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response)  
        throws ServletException, IOException {  

        response.setContentType("text/html");  
        PrintWriter out = response.getWriter();  
       
        
        //String n=request.getParameter("username");  
        out.print("Welcome, to admin page");
        RequestDispatcher rd=request.getRequestDispatcher("admin_page_form.jsp");  
        rd.include(request,response);  

        
        out.close();  
    }  
}

