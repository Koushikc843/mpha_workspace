package com.mphasis.firstwebapp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/greet")                       //instead of mapping in web.xml we can do this second way easy way 
public class Greet extends HttpServlet {
         @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        	//how to pass parameters in url (dynamic programming) interaction with server.
        	 
        	 String name=req.getParameter("name");
        	
        	 String city=req.getParameter("city");
        	 
        	 resp.setContentType("text/html");
     		PrintWriter out= resp.getWriter();
     		//out.println("<h2> Welcome "+name+" from "+city+"<h2>");
     		//http://localhost:8083/firstwebapp/greet?name=adi&&city=bangalore
     		
     		if(name==null || city == null) {
     			out.println("<h2> hello guest <h2>");
     		}
     		else {
     			out.println("<h2> Welcome "+name+" from "+city+"<h2>");

     		}
     		
     		
        }
}


