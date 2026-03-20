package com.aditya.practice;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@WebFilter("/welcome")
public class AuthFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) {
        // Runs once when application starts
        System.out.println("AuthFilter initialized");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;
        HttpSession session = req.getSession(false);

        // Check login
        if (session == null || session.getAttribute("username") == null) {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<h2>Access Denied!</h2>");
            out.println("<p>Please login first. <a href='login'>Go to Login</a></p>");
            return;
        }


        // User is logged in → continue to servlet
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        // Runs once when application stops
        System.out.println("AuthFilter destroyed");
    }
}