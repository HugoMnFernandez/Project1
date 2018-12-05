package com.revature.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.domain.Employee;

public class HomeServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -501631436667805671L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession sess = req.getSession();
		Employee employee = (Employee) sess.getAttribute("user");
		String username = employee.getUsername();
		System.out.println(username);
		if(username == null) {
			resp.sendRedirect("html/index.html");
		}else {
			RequestDispatcher rd = req.getRequestDispatcher("html/home.html");
			rd.forward(req, resp);

		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession sess = req.getSession();
		Employee employee = (Employee) sess.getAttribute("user");
		String username = employee.getUsername();
		System.out.println(username);
		if(employee != null) {
			username = employee.getUsername();
		}
		
		if(username == null) {
			resp.sendRedirect("html/index.html");
		}else {
			System.out.println("l'user a été trouvé ma geule");
			RequestDispatcher rd = req.getRequestDispatcher("html/main.html");
			rd.forward(req, resp);

		}
	}
	
	

}
