package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReferenceEmployee {

	public static Session getRecored() {
		Configuration con = new Configuration();
		con.configure("Hibernate.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session ss = sf.openSession();
		return ss;
	}
}
