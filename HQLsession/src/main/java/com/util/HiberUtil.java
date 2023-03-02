package com.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HiberUtil {

	static SessionFactory sf = null;
	static {

		Configuration confg = new Configuration().configure("Employee.cfg.xml");

		sf = confg.buildSessionFactory();

	}

	public static Session createSes() {

		return sf.openSession();

	}
	 public static void CloseSession() {
		 
		 if(createSes()!=null) {
		 createSes().close();
		 }
	 }

	public static void main(String[] args) {

		System.out.println(createSes().isConnected());

	}

}
