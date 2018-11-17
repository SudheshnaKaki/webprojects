package com.training.ui;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/EmpServlet")
public class EmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private double salary;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("\n\n\t\t"+new Date());
		PrintWriter out = response.getWriter();
		out.println(this.id+"<br>");
		out.println(this.name+"<br>");
		out.println(this.salary+"<br>");
		
	}
	@Override
	public void init() throws ServletException {
		
	System.out.println("init is called");
	this.id = 25;
	this.name = "Anu";
	this.salary = 56800;
	}
    @Override
    public void destroy() {
	System.out.println("\n\n\t\tThis is destroy message");
	}
    public int add(int a, int b) {
    	
    	System.out.println(this.add(20, 12));
    	return a+b;
    }
}
