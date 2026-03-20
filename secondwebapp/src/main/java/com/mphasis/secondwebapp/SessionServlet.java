package com.mphasis.secondwebapp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/session")
public class SessionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();

        // -------- 1. Get ServletContext (application memory) --------
        ServletContext context = getServletContext();

        // -------- 2. Get counter from context --------
        Integer counter = (Integer) context.getAttribute("browserCounter");

        // If counter does not exist, initialize it
        if (counter == null) {
            counter = 0;
        }

        // -------- 3. Check if browser marker cookie exists --------
        boolean cookieFound = false;
        Cookie[] cookies = req.getCookies();

        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("BROWSER_MARKER")) {
                    cookieFound = true;
                    break;
                }
            }
        }

        // -------- 4. If cookie NOT found → browser reopened --------
        if (!cookieFound) {
            counter++; // increase counter
            context.setAttribute("browserCounter", counter);

            // create session-only cookie
            Cookie marker = new Cookie("BROWSER_MARKER", "yes");
            marker.setPath("/");
            resp.addCookie(marker);
        }

        // -------- 5. Get session id --------
        String sessionId = req.getSession().getId();

        // -------- 6. Display result --------
        out.println("<h3>Session ID: " + sessionId + "</h3>");
        out.println("<h3>Browser Reopen Count: " + counter + "</h3>");
    }
}
