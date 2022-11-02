package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveData {
	
	public static void main(String[] args) {
		Session ss = ReferenceEmployee.getRecored();
		Transaction tr = ss.beginTransaction();

		Maruthi e1 = new Maruthi();
		e1.setId(1);
		e1.setName("One");
		e1.setCourse("Bcom");
		e1.setLocation("Hyd");
		e1.setMob(1234567890);
		ss.save(e1);
		
		Maruthi e2 = new Maruthi();
		e2.setId(2);
		e2.setName("Two");
		e2.setCourse("Bsc");
		e2.setLocation("Bng");
		e2.setMob(1234567890);
		ss.save(e2);
		Maruthi e3 = new Maruthi();
		
		e3.setId(3);
		e3.setName("Three");
		e3.setCourse("Bcom");
		e3.setLocation("Hyd");
		e3.setMob(1234567890);
		ss.save(e3);
		
		Maruthi e4 = new Maruthi();
		e4.setId(4);
		e4.setName("Four");
		e4.setCourse("Bsc");
		e4.setLocation("Bng");
		e4.setMob(1234567890);
		ss.save(e4);
		
		Maruthi e5 = new Maruthi();
		e5.setId(5);
		e5.setName("Five");
		e5.setCourse("Bcom");
		e5.setLocation("Hyd");
		e5.setMob(1234567890);
		ss.save(e5);
		
		Maruthi e6 = new Maruthi();
		e6.setId(6);
		e6.setName("Six");
		e6.setCourse("Bsc");
		e6.setLocation("Bng");
		e6.setMob(1234567890);
		ss.save(e6);

		tr.commit();
		System.out.println("Data saved");

	}
}
