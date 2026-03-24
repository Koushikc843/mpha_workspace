package com.mphasis.assignment;

import java.io.IOException;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;

public class GreetingTag extends SimpleTagSupport {

    private String name;
    private String timeOfDay;

    public void setName(String name) {
        this.name = name;
    }

    public void setTimeOfDay(String timeOfDay) {
        this.timeOfDay = timeOfDay;
    }

    @Override
    public void doTag() throws JspException, IOException {

        JspWriter out = getJspContext().getOut();

        String time = (timeOfDay == null) ? "day" : timeOfDay.toLowerCase();

        String msg;

        switch (time) {
            case "morning":
                msg = "Good morning, " + name + "!";
                break;
            case "afternoon":
                msg = "Good afternoon, " + name + "!";
                break;
            case "evening":
                msg = "Good evening, " + name + "!";
                break;
            case "night":
                msg = "Good night, " + name + "!";
                break;
            default:
                msg = "Hello, " + name + "!";
        }

        out.print(msg);
    }
}