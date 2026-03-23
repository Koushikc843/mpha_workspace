package com.mphasis.productmanagerapp.customtags;

import java.io.*;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;

public class UpperCaseTag extends SimpleTagSupport{
	@Override
	public void doTag() throws JspException, IOException {
		StringWriter c=new StringWriter();
		getJspBody().invoke(c);
		getJspContext().getOut().print(c.toString().toUpperCase());
		
	}

}
