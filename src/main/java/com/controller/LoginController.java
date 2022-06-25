package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Teacher;
import com.service.TeacherService;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		
		String Email=request.getParameter("ID");
		String pass=request.getParameter("pass");
		
		RequestDispatcher rd1= request.getRequestDispatcher("Home.jsp");
		RequestDispatcher rd2= request.getRequestDispatcher("login.jsp");
		if(Email=="admin@test.com"&&pass=="admin")
		{
			rd2.forward(request,response);
		}
		else
		{
			pw.println("Failed to login...Try Again!");
			rd1.include(request, response);
		}
		
		
	}

}
