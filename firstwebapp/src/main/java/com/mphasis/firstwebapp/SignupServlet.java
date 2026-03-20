package com.mphasis.firstwebapp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/signup")
public class SignupServlet extends HttpServlet {
     @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {   //dopost is used for post method used in html so will dopost in java
    	resp.setContentType("text/html");
    	String fname=req.getParameter("name");
    	String email=req.getParameter("email");
    	
    	PrintWriter out=resp.getWriter();
    	
    	if (email.contains("gmail")) {
			RequestDispatcher rd=req.getRequestDispatcher("failurepage.html");// request dispatcher is used to redirect to new page
			rd.forward(req, resp);
		}
    	else {
    		out.print("<h3> thank you for signing up! <h3>");
        	out.print("<h3>Full name : "+ fname +"</h3>");
        	out.print("<h3>Email : "+ email+ " </h3>");
		}
    	
    	
    }
}
//get will send the info of parameters with url
//post will not send parameters in the url safety always use this with forms 