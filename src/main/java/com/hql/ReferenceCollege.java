package com.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReferenceCollege {
	public static Session getHqlRecored() {
		Configuration con = new Configuration();
		con.configure("Hibernate.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session ss = sf.openSession();
		return ss;
	}

}
