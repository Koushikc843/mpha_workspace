package com.mphasis.secondwebapp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


//  http://localhost:8083/secondwebapp/dbservlet
//i am storing parameters in xml file and any servlet can access the parameters
//whatever i have defined in 
@WebServlet("/dbservlet")
public class DBServlet extends HttpServlet {
 @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	resp.setContentType("text/html");
	PrintWriter out=resp.getWriter();
	out.print("<h3>"+ getServletContext().getInitParameter("database")+"</h3>");
	out.print("<h3>"+ getServletContext().getInitParameter("login")+"</h3>");
	out.print("<h3>"+ getServletContext().getInitParameter("password")+"</h3>");
}
}
