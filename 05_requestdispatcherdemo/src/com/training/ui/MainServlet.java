package com.training.ui;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//List<String> city = new ArrayList
		RequestDispatcher dispatcher = request.getRequestDispatcher("this is dummy Servlet");
		
		String myName = "Sudheshna";
		String myNativePlace = "West Godavari";
		
		
		
		request.setAttribute("NAME", myName);
		request.setAttribute("NATIVEPLACE", myNativePlace);
		request.setAttribute("NAME", myName);
		request.setAttribute("TODAY", new Date());
		request.setAttribute("AGE", new Integer(20));
		
		dispatcher.forward(request, response);
	}
}
