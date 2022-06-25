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
import com.bean.Subject;
import com.service.ClassService;
import com.service.SubjectService;

/**
 * Servlet implementation class SubjectController
 */
public class SubjectController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SubjectController() {
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
		SubjectService subService=new SubjectService();
		
		List<Subject> listOfSubject=subService.getAllSubject();
	    hs.setAttribute("listOfSubject", listOfSubject);
		response.sendRedirect("SubjectsTable.jsp");
		
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
		String sName=request.getParameter("sName");
		
		Subject sub=new Subject();
		sub.setSID(CID);
		sub.setsName(sName);
		
		SubjectService subService=new SubjectService();
		
		String retVal=subService.addSubject(sub);
		pw.println(retVal);
		
		RequestDispatcher rd= request.getRequestDispatcher("subject.jsp");
		rd.include(request, response);
		
	}

}
