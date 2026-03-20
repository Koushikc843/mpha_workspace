package com.mphasis.secondwebapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/report")
public class SimpleReport extends HttpServlet {
	List<String> courses=Arrays.asList("Java","Spring","Html");
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
	out.print("<table><tr><th>Course</th></tr>");
//	for(String c:courses) {
//		out.print("<tr>course</tr>);
//	}
	}

}
