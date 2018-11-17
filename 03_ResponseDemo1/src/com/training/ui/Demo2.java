package com.training.ui;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Demo2")
public class Demo2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out = response.getWriter();	
	int rollNo = 5001;
	String name = "Anu";
	String city = "Chennai";
	response.setContentType("text/xml");
	out.println("<Student>");
	out.println("<Rollno>" +rollNo+"</Rollno>");
	out.println("<City>"+city+"</City>");
	out.println("<name>"+name+"</name>");
	out.println("</Student>");
	
	}

}
