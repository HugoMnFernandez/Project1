package com.revature.servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.domain.Employee;
import com.revature.service.AuthService;

public class LoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7462990917708254156L;
	
	private AuthService aServ = new AuthService();

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		String username = req.getParameter("username");
		System.out.println("Username = "+username);
		String password = req.getParameter("password");
		System.out.println("Password = "+password);
		
		Employee employee = aServ.validateUser(username, password);
		
		
		
		if(employee != null) {
			//redirect to home page
			
			System.out.println("User found: " + employee.toString());
			HttpSession sess = req.getSession();
			sess.setAttribute("user", employee);
			System.out.println("Session created");
			RequestDispatcher rd = req.getRequestDispatcher("home");
			rd.forward(req,res);
		}else {
			res.sendRedirect("html/login.html");
			
		}
		
		
		
	}
	
protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		String username = req.getParameter("username");
		System.out.println("Username = "+username);
		String password = req.getParameter("password");
		System.out.println("Password = "+password);
		
		Employee employee = aServ.validateUser(username, password);
		
		System.out.println("User found: " + employee);
		
		if(employee != null) {
			//set up a session
			HttpSession sess = req.getSession();
			sess.setAttribute("user", employee);
			//redirect to home page
			RequestDispatcher rd = req.getRequestDispatcher("home");
			rd.forward(req,res);
		}
		else {
			res.getWriter().write("<h1>Wrong username/password</h1>");
		}
		
		
		
	}

}
