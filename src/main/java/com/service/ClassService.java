package com.service;

import com.dao.ClassDao;

import java.util.List;

import com.bean.Class;
public class ClassService {
	
	ClassDao classDao=new ClassDao();
	
	public String addClass(Class cls)
	{
		if(classDao.insertClass(cls)>0)
		{
			return "Record added Succesfully!";
		}
		else
		{
			return "Error in adding record. Please try again!";
		}
	}
	
	public String addSubject(int CID,int SID)
	{
		if(classDao.addSubject(CID,SID)>0)
		{
			return "Record added Succesfully!";
		}
		else
		{
			return "Error in adding record. Please try again!";
		}
	}
	public List<Class> getAllClass()
	{
		List<Class> listOfClasses=classDao.getAllClass();
		return listOfClasses;
	}
	public Class getClass(int CID)
	{
		Class cls=classDao.getClass(CID);
		return cls;
	}
	public String addTeacher(int CID,int TID)
	{
		if(classDao.addTeacher(CID,TID)>0)
		{
			return "Record added Succesfully!";
		}
		else
		{
			return "Error in adding record. Please try again!";
		}
	}
}
