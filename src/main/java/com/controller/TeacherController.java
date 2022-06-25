package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.Class;
import com.bean.Teacher;
import com.service.ClassService;
import com.service.TeacherService;

/**
 * Servlet implementation class TeacherController
 */
public class TeacherController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TeacherController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter pw=response.getWriter();
		HttpSession hs=request.getSession();
		TeacherService tchService=new TeacherService();
		
		List<Teacher> listOfTeacher=tchService.getAllTeacher();
	    hs.setAttribute("listOfTeacher",listOfTeacher);
		response.sendRedirect("TeachersTable.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		
		int CID=Integer.parseInt(request.getParameter("CID"));
		String fName=request.getParameter("fName");
		String lName=request.getParameter("lName");
		Teacher tch=new Teacher();
		tch.setTID(CID);
		tch.setfName(fName);
		tch.setlName(lName);
		TeacherService tchService=new TeacherService();
		
		String retVal=tchService.addTeacher(tch);
		pw.println(retVal);
		RequestDispatcher rd= request.getRequestDispatcher("teacher.jsp");
		rd.include(request, response);
	}

}
