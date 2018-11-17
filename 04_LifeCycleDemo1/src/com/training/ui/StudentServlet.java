package com.training.ui;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(
		urlPatterns = { "/StudentServlet" }, 
		initParams = { 
				@WebInitParam(name = "i_rollno", value = "105"), 
				@WebInitParam(name = "i_name", value = "adhi"), 
				@WebInitParam(name = "i_age", value = "20")
		})
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int rollno;
	private String name;
	private int age;
	@Override
	public void init() throws ServletException {
		ServletConfig config = getServletConfig();
		String strRoll = config.getInitParameter("i_rollno");
		String strName = config.getInitParameter("i_name");
		String strAge = config.getInitParameter("i_age");
		this.rollno = Integer.parseInt(strRoll);
		this.name = strName;
		this.age = Integer.parseInt(strAge);
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println(this.rollno);
		out.println(this.name);
		out.println(this.age);
		
	}

}
