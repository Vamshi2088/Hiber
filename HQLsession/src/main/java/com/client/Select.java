package com.client;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.pojo.Employe;
import com.util.HiberUtil;

public class Select {

	public static void main(String[] args) {

		
		Session session=HiberUtil.createSes();
		
		session.beginTransaction();
		
//		Select all query
		
//		List  <Employe> list = session.createQuery("from Employe").list();
//		
//		for (Employe employe : list) {
//			System.out.println(employe);
//		}
//		
		
		
//		select requried
//		List <Object[]> list = session.createQuery("select e.name,e.fee,e.email from Employe e").list();
//		
//		for (Object[] objects : list) {
//			System.out.println(objects[0]);
//			System.out.println(objects[1]);
//			System.out.println(objects[2]);
//			
//		}
		
		
		// using where clause
//		List <Object[]> list = session.createQuery("select e.name,e.fee,e.email from Employe e where e.id=11").list();
//		
//		for (Object[] objects : list) {
//			
//			System.out.println(objects[0]);
//			System.out.println(objects[1]);
//			System.out.println(objects[2]);
//		}
		
		
		
	}

}
