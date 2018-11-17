package com.training.ui;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Demo5")
public class Demo5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String[] subjects = { "English", "Physics","Social"};
		double[] marks = {70.0, 75.0, 81.0};
		double sum = 0;
		response.setContentType("text.html");
		out.println("<table>");
		out.println("<tr>");
		out.println("<th>Subjects");
		
			for(int i=0;i<subjects.length;i++)
							{
								
								out.print("<tr>");
								out.println("<td>"+subjects[i]+"</td>"+"<td>" + marks[i]+"</td>");
								sum = sum + marks[i];
							
								out.print("</tr>");
							} 
			out.print("<tr>");
							out.println("<td>"+"Total"+"</td>"+"<td>" + sum+"</td>");
							out.print("</tr>");
							
							out.print("<tr>");
							out.println("<td>"+"Average"+"</td>"+"<td>" + sum/subjects.length+"</td>");
							out.print("</tr>"); 
			 

	}

}
