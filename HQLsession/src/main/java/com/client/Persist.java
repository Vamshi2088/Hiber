package com.client;

import org.hibernate.Session;

import com.pojo.Employe;
import com.util.HiberUtil;

public class Persist {

	public static void main(String[] args) {

		Employe e1=new Employe("vamshi", 500.50, "vamshi@gmail.com");
		Employe e2=new Employe("swamy", 400.50, "swamy@gmail.com");
		Employe e3=new Employe("laxman", 600.50, "laxman@gmail.com");
		Employe e4=new Employe("kranthi", 250.50, "kranthi@gmail.com");
		
		Employe [] e= {e1,e2,e3,e4};
		
		Session session=HiberUtil.createSes();
		
		session.getTransaction().begin();
		
		for (Employe employe : e) {
			
			session.persist(employe);
			
		}
		
		session.getTransaction().commit();
		
		HiberUtil.CloseSession();
		
		
	}

}
