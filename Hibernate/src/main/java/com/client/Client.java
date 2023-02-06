package com.client;



import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.domain.Student;

public class Client {
	
	public static void main(String[] args) {
		
	Student ss=new Student(88, "vamshi", 45000, "vamshi@gmail.com");
	Student ss1=new Student(88, "vam", 45000, "vamshi@gmail.com");
	Student ss2=new Student(88, "vams", 45000, "vamshi@gmail.com");
	
	List<Student> l=new ArrayList<>();
	Student []s= {ss,ss1,ss2};
	

	
	
	
	
		Configuration conf=new Configuration();
		conf.configure("configuration.cfg.xml");
		SessionFactory sessionFactroy=conf.buildSessionFactory();
		Session sess=sessionFactroy.openSession();
		Transaction tx = sess.beginTransaction();
		for (Student student : s) {
			sess.save(student);
		}
		
		
		
		
		tx.commit();
//		sess.close();
  
}
}
