package com.capgemini.ui;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/RDPS")
public class RequestDataPrintingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println(request.getRequestURI());
		out.println("<br>");
		out.println(request.getRequestURI());
		out.println("<br>");
		out.println(request.getServerName());
		out.println("<br>");
		out.println(request.getRequestURL());
		out.println("<br>");
		out.println(request.getServerPort());
		out.println("<br>");
		out.println(request.getLocalName());
		
		out.println("<br>");
		out.println(request.getRemoteHost());
		out.println("<br>");
		out.println(request.getRemoteUser());
		out.println("<br>");
		
		out.println(request.getRemoteAddr());
		out.println("<br>");
		
	}

}
