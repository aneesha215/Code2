package com.dao;




import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.resource.DBSessionFactory;
import com.bean.Class;
import com.bean.Subject;
import com.bean.Teacher;
public class ClassDao {

	public int insertClass(Class cls)
	{
		try {
			
			SessionFactory sf=DBSessionFactory.getSessionFactoryReference();
			Session session=sf.openSession();
			Transaction t=session.getTransaction();
			
			t.begin();
			 session.save(cls);
			t.commit();
			return 1;
			
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}
	
	public int addSubject(int CID,int SID)
	{
try {
			
			SessionFactory sf=DBSessionFactory.getSessionFactoryReference();
			Session session=sf.openSession();
			Transaction t=session.getTransaction();
			
			t.begin();
			 Class cls=(Class)session.get(Class.class,new Integer(CID));
			 Subject sub=(Subject)session.get(Subject.class,new Integer(SID));
			 cls.getListOfSubject().add(sub);
			 session.update(cls);
			t.commit();
			return 1;
			
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}
	
	public List<Class> getAllClass()
	{
		SessionFactory sf=DBSessionFactory.getSessionFactoryReference();
		Session session=sf.openSession();
		Transaction t=session.getTransaction();
		Query q=session.createQuery("select cls from Class cls");
		List<Class> classes=q.list();
		return classes;
	}
	
	public Class getClass(int CID)
	{
		SessionFactory sf=DBSessionFactory.getSessionFactoryReference();
		Session session=sf.openSession();
		Transaction t=session.getTransaction();
		Class cls = session.get(Class.class, CID);
		return cls;
	}
	
	public int addTeacher(int CID,int TID)
	{
try {
			
			SessionFactory sf=DBSessionFactory.getSessionFactoryReference();
			Session session=sf.openSession();
			Transaction t=session.getTransaction();
			
			t.begin();
			 Class cls=(Class)session.get(Class.class,new Integer(CID));
			 Teacher tch=(Teacher)session.get(Teacher.class,new Integer(TID));
			 cls.getListOfTeacher().add(tch);
			 session.update(cls);
			t.commit();
			return 1;
			
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}
	
}
