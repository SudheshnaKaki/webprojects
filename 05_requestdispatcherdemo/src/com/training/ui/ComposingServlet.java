package com.training.ui;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ComposingServlet")
public class ComposingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//RequestDispatcher dispatcher1,dispatcher2,dispatcher3 = null;
		//RequestDispatcher dispatcher2 = null;
		//RequestDispatcher dispatcher3 = null;
		
		RequestDispatcher dispatcher1 = request.getRequestDispatcher("Header.html");
		RequestDispatcher dispatcher2 = request.getRequestDispatcher("Main.html");
		RequestDispatcher dispatcher3 = request.getRequestDispatcher("Footer.html");
		dispatcher1.include(request, response);
		dispatcher2.include(request, response);
		dispatcher3.include(request, response);
	}

}
