package com.devon.web.controllers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.devon.web.models.Player;
import com.devon.web.models.Team;

/**
 * Servlet implementation class Players
 */
@WebServlet("/Players")
public class Players extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Players() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		HttpSession session = request.getSession();
		ArrayList<Team>teams = new ArrayList<Team>();
		teams = (ArrayList<Team>)session.getAttribute("teams");	
		request.setAttribute("id", request.getParameter("id"));
		request.setAttribute("team", teams.get(id));
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/NewPlayer.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		HttpSession session = request.getSession();
		ArrayList<Team>teams = new ArrayList<Team>();
		teams = (ArrayList<Team>)session.getAttribute("teams");	
		String fn = request.getParameter("firstName");
		String ln = request.getParameter("lastName");
		int age = Integer.parseInt(request.getParameter("age"));
		Player player = new Player(fn,ln,age);
		teams.get(id).addPlayer(player);
		response.sendRedirect("/TeamRoster/Teams?id="+request.getParameter("id"));
	}

}
