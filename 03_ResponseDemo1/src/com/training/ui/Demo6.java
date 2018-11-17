package com.training.ui;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;
import com.training.entity.Player;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Demo6")
public class Demo6 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Set<Player> players = new HashSet<Player>();
		Player p1 = new Player(101,"Suresh",100,900,40,false);
		Player p2 = new Player(102,"jadeja",100,900,40,false);
		Player p3 = new Player(103,"bhumrah",100,900,40,false);
		Player p4 = new Player(104,"Dhoni",100,900,40,true);
		Player p5 = new Player(105,"virat",100,900,40,true);
		Player p6 = new Player(106,"bajji",100,900,40,false);
		Player p7 = new Player(107,"sachin",100,900,40,true);
		Player p8 = new Player(108,"uv",100,900,40,true);
		Player p9 = new Player(109,"bhuvaneshwar",100,900,40,false);
		Player p10 = new Player(110,"david",100,900,40,false);
		Player p11 = new Player(111,"rohit",100,900,40,true);
		players.add(p1);
		players.add(p2);
		players.add(p3);
		players.add(p4);
		players.add(p5);
		players.add(p6);
		players.add(p7);
		players.add(p8);
		players.add(p9);
		players.add(p10);
		players.add(p11);
		
		out.println("<html>");
		out.println("<head>");
		out.println("<link href='style.css' rel='Sytlesheet'>");
		out.println("</head>");
		out.println("<body>");
		out.println("</body>");
		
		out.println("<table border='1'>");
		out.println("<table>");
		out.println("<tr>");
		out.println("<th>Player_id"+"<th>Player_name"+"<th>No_Of_Matches"+"<th>Run_score"+"<th>Wickets"+"<th>IS Captain"+"<th>BattingRate");
		out.println("</tr>");
		out.println("<tr>");
		for (Player player : players) {
			out.println("<td>"+player.getPlayer_id()+"</td>"+"<td>"+player.getPlayer_name()+
					"</td>" +"<td>"+player.getNoOfMatches()+"</td>"+"<td>"+player.getTotalRunsScore()+"</td>"+"<td>"
					+player.getNoOfWickets()+"</td>"+"<td>"+player.isCaptain()+"</td>");
			out.println("</tr>");
		}
		out.println("</table>");
		out.println("</html>");
	}

}
