package com.service;

import java.util.List;


import com.bean.Subject;
import com.dao.SubjectDao;

public class SubjectService {
SubjectDao subjectDao=new SubjectDao();
	
	public String addSubject(Subject sub)
	{
		if(subjectDao.insertSubject(sub)>0)
		{
			return "Record added Succesfully!";
		}
		else
		{
			return "Error in adding record. Please try again!";
		}
	}
	public List<Subject> getAllSubject()
	{
		List<Subject> listOfSubjects=subjectDao.getAllSubject();
		return listOfSubjects;
	}
	public String addTeacher(int SID,int TID)
	{
		if(subjectDao.addTeacher(SID,TID)>0)
		{
			return "Record added Succesfully!";
		}
		else
		{
			return "Error in adding record. Please try again!";
		}
	}
}
