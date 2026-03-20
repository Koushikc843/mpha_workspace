package com.mphasis.productmanagerapp.controller;

import java.io.IOException;

import com.mphasis.productmanagerapp.model.UserModel;
import com.mphasis.productmanagerapp.service.LoginService;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/logincontroller")
public class LoginController extends HttpServlet {
	
	private LoginService ls=new LoginService();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	RequestDispatcher rd=req.getRequestDispatcher("WEB-INF/view/loginform.jsp");
	req.setAttribute("msg"," ");

	rd.forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String login=req.getParameter("lg");
		String password=req.getParameter("ps");
		UserModel us=new UserModel(login,password);
		
		
	
		if(ls.check(us)){
			RequestDispatcher rd=req.getRequestDispatcher("WEB-INF/view/loginsuccess.jsp");
			rd.forward(req, resp);
		}
		else {
			RequestDispatcher rd=req.getRequestDispatcher("WEB-INF/view/loginform.jsp");
			req.setAttribute("msg","Invalid login/password");
			rd.forward(req, resp);
		}
		
	}

}
