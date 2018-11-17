package com.training.ui;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Demo4")
public class Demo4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String[] subjects = { "English", "Physics","Social"};
	double[] marks = {70.0, 75.0, 81.0};
	response.setContentType("text.html");
	PrintWriter out = response.getWriter();
	out.println("<table>");
	out.println("<tr>");
	out.println("<th>Subjects");
	for (String  s : subjects) {
		out.println("<td>"+s+"</td>");
	}
	out.println("</tr>");
	out.println("<tr>");
	out.println("<th> marks");
	for (double  d : marks) {
		out.println("<td>"+d+"</td>");
	}
	out.println("</tr>");
	out.println("</table>");
	}

}
