package com.codingdojo.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String language = request.getParameter("language") == null ? "Unknown" : request.getParameter("language");
		String firstName = request.getParameter("firstName") == null ? "Unknown" : request.getParameter("firstName");
		String lastName = request.getParameter("lastName") == null ? "Unknown" : request.getParameter("lastName");
		String hometown = request.getParameter("hometown") == null ? "Unknown" : request.getParameter("hometown");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String header = "<h1>Welcome, " + firstName + " " + lastName +  " "+" </h1>";
		String body1 = "<h2>Your Favorite language is " + language + "</h2>";
		String body2 = "<h2>Your Hometown is " + hometown + "</h2>";
		String markup = "<div>" + header + body1 + body2 + "</div>";
		int x = Integer.parseInt("2");
		out.write(markup);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
