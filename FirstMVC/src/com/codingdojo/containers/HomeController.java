package com.codingdojo.containers;

import java.io.IOException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.codingdojo.models.Person;

/**
 * Servlet implementation class HomeController
 */
@WebServlet("/HomeController")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeController() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    private static String[] names = {"Devon", "Moose", "Jarvis", "Molly", "Serious"};
    
    private String randomName() {
    	Random r = new Random();
    	return names[r.nextInt(names.length)];
    }
    
    private int randomAge() {
    	// random age b/t 18 100
    	int low = 18;
    	int high = 100;
    	int offset = high - low;
    	Random r = new Random();
    	return r.nextInt(offset) + low;
    	
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int numPeople = Integer.parseInt(request.getParameter("numPeople"));
		Person[] people = new Person[numPeople];
		for(int i = 0; i < people.length; i++)
			people[i] = new Person(this.randomName(), this.randomAge());
		request.setAttribute("people", people);
		
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/showPerson.jsp");
		view.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
