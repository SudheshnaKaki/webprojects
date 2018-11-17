package com.training.ui;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Demo3")
public class Demo3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		List<String> playerNames = new ArrayList<>();
		playerNames.add("Dhoni");
		playerNames.add("Virat Kohli");
		playerNames.add("Rohit sharma");
		//response.getContentType();
		out.println("<ul>");
		for(String string : playerNames) {
			
			out.println("<li>"+string+"</li>");
			
		}
		out.println("</ul>");
	}

}
