package com.aditya.practice;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    // ✅ This will open when you type /login in browser
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<h2>Login Page</h2>");
        out.println("<form method='post' action='login'>");
        out.println("Username: <input type='text' name='username' /> <br><br>");
        out.println("<button type='submit'>Login</button>");
        out.println("</form>");
    }

    // ✅ This will run when you submit the form
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        String username = request.getParameter("username");

        HttpSession session = request.getSession(); // creates session
        session.setAttribute("username", username);

        response.sendRedirect("welcome");
    }
}