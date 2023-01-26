package com.server;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HttpServletEx extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 747089640831650012L;
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		String userName = request.getParameter("username");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><body><h1>get</h1>");
		out.println(userName);
		out.println("</html></body>");
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		String userName = request.getParameter("username");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><body><h1>post</h1>");
		out.println(userName);
		out.println("</html></body>");
	}

}
