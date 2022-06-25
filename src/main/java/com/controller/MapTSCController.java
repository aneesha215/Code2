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
import com.service.SubjectService;

/**
 * Servlet implementation class MapTSCController
 */
public class MapTSCController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MapTSCController() {
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
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		
		int CID=Integer.parseInt(request.getParameter("CID"));
		int SID=Integer.parseInt(request.getParameter("SID"));
		int TID=Integer.parseInt(request.getParameter("SID"));

		ClassService clsService =new ClassService();
		String retVal1=clsService.addTeacher(CID,TID);
		
		SubjectService subService =new SubjectService();
		String retVal2=subService.addTeacher(SID,TID);
		
		pw.println(retVal1);
		pw.println(retVal2);
		
		RequestDispatcher rd= request.getRequestDispatcher("mapTeacherSubjectClass.jsp");
		rd.include(request, response);
	}

}
