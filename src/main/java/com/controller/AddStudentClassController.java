package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.ClassService;
import com.service.StudentService;

/**
 * Servlet implementation class AddStudentClassController
 */
public class AddStudentClassController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddStudentClassController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		
		int CID=Integer.parseInt(request.getParameter("CID"));
		int SID=Integer.parseInt(request.getParameter("SID"));

		StudentService stdService =new StudentService();
		
		String retVal=stdService.addClass(CID,SID);
		pw.println(retVal);
		
		RequestDispatcher rd= request.getRequestDispatcher("addStudentClass.jsp");
		rd.include(request, response);
	}

}
