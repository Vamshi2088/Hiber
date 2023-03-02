package com.client;

import java.util.List;


import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pojo.Employe;

public class EmployeClient {

	public static void main(String[] args) {

		
		Employe e=new Employe("vamshi", 2500.50, 'A');
		
		Configuration conf=new Configuration().configure("Employe.cfg.xml");
		
		SessionFactory sf=conf.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction t = session.beginTransaction();
		
		session.save(e);
		
		t.commit();
		
		session.close();
		
		
	}

}
