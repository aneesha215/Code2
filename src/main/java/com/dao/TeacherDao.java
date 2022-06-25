package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.bean.Class;
import com.bean.Teacher;
import com.resource.DBSessionFactory;

public class TeacherDao {
	public int insertTeacher(Teacher tch)
	{
		try {
			
			SessionFactory sf=DBSessionFactory.getSessionFactoryReference();
			Session session=sf.openSession();
			Transaction t=session.getTransaction();
			
			t.begin();
			 session.save(tch);
			t.commit();
			return 1;
			
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}
	public List<Teacher> getAllTeacher()
	{
		SessionFactory sf=DBSessionFactory.getSessionFactoryReference();
		Session session=sf.openSession();
		Transaction t=session.getTransaction();
		Query q=session.createQuery("select tch from Teacher tch");
		List<Teacher> teacher=q.list();
		return teacher;
}
}