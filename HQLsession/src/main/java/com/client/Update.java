package com.client;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.util.HiberUtil;

public class Update {

	public static void main(String[] args) {

		Session session=HiberUtil.createSes();
		
		session.getTransaction().begin();
		
		String UPDATE_QUERY="update Employe e set e.email='newEmail' where e.fee=600.5";
		
		Query query = session.createQuery(UPDATE_QUERY);
		
		int i = query.executeUpdate();
		
		System.out.println("updated "+i);
		
		session.getTransaction().commit();
		
		HiberUtil.CloseSession();
		
		
		
	}

}
