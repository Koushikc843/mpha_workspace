package com.mphasis.firstwebapp;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//this servlet creates data and sends it to servlet b.
@WebServlet("/servleta")
public class ServletA extends HttpServlet{
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        	String company="Mphasis";
        	String training="Java";
        	String location="cluster C";
        	//before forwarding to send both variables and its data to servletb
        	//in a we say set and in b we say get
        	req.setAttribute("company", "Mphasis");
        	req.setAttribute("training", "Java");
        	req.setAttribute("location", "cluster C");
        	
        	//1st way is to share data between 2 servlets.
        	RequestDispatcher rd=req.getRequestDispatcher("servletb");   //redirection to servlet b. forwarding to servlet b.
        	rd.forward(req, resp);
        }
}
