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
import com.service.ClassService;

/**
 * Servlet implementation class ClassController
 */
public class ClassController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClassController() {
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
		ClassService clsService=new ClassService();
		
		List<Class> listOfClasses=clsService.getAllClass();
	    hs.setAttribute("listOfClass", listOfClasses);
		response.sendRedirect("ClassTable.jsp");
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
		String cName=request.getParameter("cName");
		
		Class cls=new Class();
		cls.setSID(CID);
		cls.setcName(cName);
		
		ClassService clsService=new ClassService();
		
		String retVal=clsService.addClass(cls);
		pw.println(retVal);
		
		RequestDispatcher rd= request.getRequestDispatcher("class.jsp");
		rd.include(request, response);
		
	}

}
