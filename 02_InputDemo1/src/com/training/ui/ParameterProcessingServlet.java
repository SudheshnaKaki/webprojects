package com.training.ui;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/PPS")
public class ParameterProcessingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
  
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Map<String,String[]> map = request.getParameterMap();
		Set<String> allKeys = map.keySet();
		for(String key : allKeys) {
			//out.println(key +"<br>");
			//out.println(key+ "" +map.get(key)+"<br>");
			out.println(key+":");
			String[] arr = map.get(key);
			for(String s : arr){
				out.println(s);
			}
		}
		
	}

}
