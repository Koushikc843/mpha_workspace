package com.mphasis.firstwebapp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/calc")
public class Calc extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        
        resp.setContentType("text/html");

        // Get values from HTML form
        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));
        String op = req.getParameter("op");

        int result = 0;

        // Perform operation
        if (op.equals("+")) {
            result = num1 + num2;
        } else if (op.equals("-")) {
            result = num1 - num2;
        } else if (op.equals("*")) {
            result = num1 * num2;
        } else if (op.equals("/")) {
            result = num1 / num2;
        }

        // Send output to browser
        PrintWriter out = resp.getWriter();


        out.println("<h2>Calculation Result</h2>");
        out.println("<p>Number 1: " + num1 + "</p>");
        out.println("<p>Number 2: " + num2 + "</p>");
        out.println("<p>Operation: " + op + "</p>");
        out.println("<p>Result: " + result + "</p>");
    }
}