package com.zettamine.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateFactoryUtil {
	public static SessionFactory sFact;

	public static SessionFactory getSessionFactory() {
		if (sFact==null) {
			Configuration confg = new Configuration();
			confg.configure("hibernate.config.xml");
			
			sFact= confg.buildSessionFactory();
			System.out.println("inside session factory");
		}
		return sFact;
	
	}
	

}
