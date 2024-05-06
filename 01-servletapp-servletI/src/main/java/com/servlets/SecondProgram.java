package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SecondProgram extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("generic servlet");
		
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("welcome to servlet");
		out.println("date = "+ new Date().toString());
		
	}

}
