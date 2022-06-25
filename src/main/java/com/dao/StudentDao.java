package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.bean.Class;
import com.bean.Student;
import com.bean.Subject;
import com.resource.DBSessionFactory;

public class StudentDao {
	public int insertStudent(Student std)
	{
		try {
			
			SessionFactory sf=DBSessionFactory.getSessionFactoryReference();
			Session session=sf.openSession();
			Transaction t=session.getTransaction();
			
			t.begin();
			 session.save(std);
			t.commit();
			return 1;
			
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}
	public int addClass(int CID,int SID)
	{
try {
			
			SessionFactory sf=DBSessionFactory.getSessionFactoryReference();
			Session session=sf.openSession();
			Transaction t=session.getTransaction();
			
			t.begin();
			 Class cls=(Class)session.get(Class.class,new Integer(CID));
			 Student stu=(Student)session.get(Student.class,new Integer(SID));
			 stu.setClass(cls);
			 session.update(stu);
			t.commit();
			return 1;
			
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
}
	public List<Student> getAllStudent()
	{
		SessionFactory sf=DBSessionFactory.getSessionFactoryReference();
		Session session=sf.openSession();
		Transaction t=session.getTransaction();
		Query q=session.createQuery("select std from Student std");
		List<Student> students=q.list();
		return students;
	}
}
