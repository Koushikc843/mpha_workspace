package com.mphasis.productmanagerapp.controller;

import java.io.IOException;

import jakarta.servlet.AsyncContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/asyncProcess", asyncSupported = true)
public class ModernAsyncServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
                // Start async mode
         	
                // Pass task to a background thread (preferably from a managed thread pool
 	final AsyncContext asyncContext = request.startAsync();
        asyncContext.start(() -> {
            try {
                // Simulate long-running process
                Thread.sleep(3000); 
                    ServletResponse resp = asyncContext.getResponse();
                resp.getWriter().println("Asynchronous task completed!");
                                // Finalize the response
                asyncContext.complete();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}