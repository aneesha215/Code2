package com.service;

import java.util.List;

import com.bean.Teacher;
import com.dao.TeacherDao;

public class TeacherService {
TeacherDao teacherDao=new TeacherDao();
	
	public String addTeacher(Teacher tch)
	{
		if(teacherDao.insertTeacher(tch)>0)
		{
			return "Record added Succesfully!";
		}
		else
		{
			return "Error in adding record. Please try again!";
		}
	}
	public List<Teacher> getAllTeacher()
	{
		List<Teacher> listOfTeachers=teacherDao.getAllTeacher();
		return listOfTeachers;
	}
}
