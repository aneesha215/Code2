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
import com.bean.Student;
import com.service.ClassService;
import com.service.StudentService;

/**
 * Servlet implementation class StudentController
 */
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentController() {
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
		StudentService stdService=new StudentService();
		
		List<Student> listOfStudent=stdService.getAllStudent();
	    hs.setAttribute("listOfStudent", listOfStudent);
		response.sendRedirect("StudentsTable.jsp");
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
		Student std=new Student();
		std.setSID(CID);
		std.setfName(fName);
		std.setlName(lName);
		StudentService stdService=new StudentService();
		
		String retVal=stdService.addStudent(std);
		pw.println(retVal);
		RequestDispatcher rd= request.getRequestDispatcher("student.jsp");
		rd.include(request, response);
	}

}
