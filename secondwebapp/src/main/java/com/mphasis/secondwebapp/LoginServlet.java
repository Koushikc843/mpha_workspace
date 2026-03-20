package com.mphasis.secondwebapp;

import java.io.IOException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/dologin")
public class LoginServlet extends HttpServlet {
	private Loginservice loginService = new Loginservice();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String login = req.getParameter("lg");
		String password = req.getParameter("pw");
		RequestDispatcher rd = req.getRequestDispatcher("resultservlet");
		if (loginService.check(login, password))
			req.setAttribute("msg", "Welcome " + login);
		else
			req.setAttribute("msg", "Invalid login/password");
		rd.forward(req, resp);
	}

}