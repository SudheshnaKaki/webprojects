package com.training.ui;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DummyServlet")
public class DummyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("this is dummy method");
		String s1 = (String) request.getAttribute("NAME");
		String s2 = (String) request.getAttribute("NATIVEPLACE");
		Date d1 = (Date) request.getAttribute("TODAY");
		Integer age = (Integer) request.getAttribute("AGE");
		out.println(s1);
		out.println("<br>");
		out.println(s2);
		out.println("<br>");
		out.println(d1);
		out.println("<br>");
		out.println(age);
		out.println("<br>");
		
	}

}
