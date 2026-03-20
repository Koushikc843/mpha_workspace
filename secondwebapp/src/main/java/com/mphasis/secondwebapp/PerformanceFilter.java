package com.mphasis.secondwebapp;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class PerformanceFilter implements Filter {  //autofill jakarta filter
           @Override
        public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
        		throws IOException, ServletException {
        	System.out.println("Welcome");
        	chain.doFilter(req,resp);
        	System.out.println("Thanks for visiting");
        	
        }
}
