package com.dao;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bean.Student;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setSid(001);
		student.setSname("Abhi");
		student.setSmarks("9");
		System.out.println("Object detail :: "+student.getSname()+" , "+student.getSid()+" , "+student.getSmarks());		
		Configuration cfg = new Configuration();		
		cfg.configure("/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session=sf.openSession();
		session.save(student);
		session.beginTransaction().commit();
		session.evict(student);			
	}
	
	public void TestInsert(Student student) {
		student.setSid(004);
		System.out.println("Object detail :: "+student.getSname()+" , "+student.getSid()+" , "+student.getSmarks());		
		Configuration cfg = new Configuration();		
		cfg.configure("/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session=sf.openSession();
		session.save(student);
		session.beginTransaction().commit();
		session.evict(student);	
	}

}
