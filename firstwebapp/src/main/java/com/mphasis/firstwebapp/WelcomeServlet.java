package com.mphasis.firstwebapp;

import java.io.IOException;
import java.io.PipedWriter;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;  //crl + shift + o  -> auto import
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class WelcomeServlet extends HttpServlet {   //by extending HttpServlet you make it servlet class from normal class
	// crl+space -> auto suggest.
	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {  // doget with crl+space
		// does not have main method instead doget method.
		// req -> from the client(browser)  res-> comes from server 
		resp.setContentType("text/html");
		PrintWriter out= resp.getWriter();
		out.println("<h2> Welcome to java Servlets ! <h2>");
		out.println("<h2> Happy Learning! </h2>");
	}

}
// restart tomcat server every time you make changes.

// do the mapping in web.xml for this file
// select the class name( WelcomeServlet) right click copy qualified name and then paste in servlet class in web.xml