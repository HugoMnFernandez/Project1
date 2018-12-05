package com.revature.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.domain.Employee;


public class RequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession sess = req.getSession();
		Employee employee = (Employee) sess.getAttribute("user");
		String username = employee.getUsername();
		System.out.println(username);
		if(username == null) {
			resp.sendRedirect("html/login.html");
		}else {
			RequestDispatcher rd = req.getRequestDispatcher("html/home.html");
			rd.forward(req, resp);

		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
