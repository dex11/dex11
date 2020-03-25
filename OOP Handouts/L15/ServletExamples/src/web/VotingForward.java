package web;



import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class VotingForward
 */
public class VotingForward extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int age = Integer.parseInt(request.getParameter("age"));
		
		if (age >= 18) {
			RequestDispatcher dispatch = request.getRequestDispatcher("canvote.html");
			dispatch.forward(request, response);
		} else {
			RequestDispatcher dispatch = request.getRequestDispatcher("noteligible.html");
			dispatch.forward(request, response);
		}
		
	}

}
