package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.bean.Class;
import com.bean.Subject;
import com.bean.Teacher;
import com.resource.DBSessionFactory;

public class SubjectDao {
	public int insertSubject(Subject sub)
	{
		try {
			
			SessionFactory sf=DBSessionFactory.getSessionFactoryReference();
			Session session=sf.openSession();
			Transaction t=session.getTransaction();
			
			t.begin();
			 session.save(sub);
			t.commit();
			return 1;
			
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}
	public List<Subject> getAllSubject()
	{
		SessionFactory sf=DBSessionFactory.getSessionFactoryReference();
		Session session=sf.openSession();
		Transaction t=session.getTransaction();
		Query q=session.createQuery("select sub from Subject sub");
		List<Subject> subjects=q.list();
		return subjects;
	}
	public int addTeacher(int CID,int TID)
	{
try {
			
			SessionFactory sf=DBSessionFactory.getSessionFactoryReference();
			Session session=sf.openSession();
			Transaction t=session.getTransaction();
			
			t.begin();
			 Subject sub=(Subject)session.get(Subject.class,new Integer(CID));
			 Teacher tch=(Teacher)session.get(Teacher.class,new Integer(TID));
			 sub.getListOfTeacher().add(tch);
			 session.update(sub);
			t.commit();
			return 1;
			
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}
}
