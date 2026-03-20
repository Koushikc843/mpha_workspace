package com.mphasis.secondwebapp;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/result")
public class Resultservlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        resp.setContentType("text/html;charset=UTF-8");
        String msg = (String) req.getAttribute("msg");

        try (PrintWriter out = resp.getWriter()) {
            out.print("""
                <!DOCTYPE html>
                <html>
                  <head>
                    <meta charset="UTF-8">
                    <title>Result</title>
                  </head>
                  <body>
            """);
            out.print("<h3>" + (msg != null ? msg : "No message") + "</h3>");
            out.print("""
                  </body>
                </html>
            """);
        }
    }

    // Optional: allow GET for convenience
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        doPost(req, resp);
    }
}