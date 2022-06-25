package com.service;

import java.util.List;

import com.bean.Student;
import com.dao.StudentDao;

public class StudentService {
StudentDao studentDao=new StudentDao();
	
	public String addStudent(Student stu)
	{
		if(studentDao.insertStudent(stu)>0)
		{
			return "Record added Succesfully!";
		}
		else
		{
			return "Error in adding record. Please try again!";
		}
	}
	public String addClass(int CID,int SID)
	{
		if(studentDao.addClass(CID,SID)>0)
		{
			return "Record added Succesfully!";
		}
		else
		{
			return "Error in adding record. Please try again!";
		}
	}
	public List<Student> getAllStudent()
	{
		List<Student> listOfStudent=studentDao.getAllStudent();
		return listOfStudent;
	}
}
