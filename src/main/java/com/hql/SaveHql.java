package com.hql;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class SaveHql {

	public static void main(String[] args) {
		Session ss = ReferenceCollege.getHqlRecored();
		Transaction tr = ss.beginTransaction();

		College c1 = new College();
		c1.setId(1);
		c1.setCname("Sai");
		c1.setDept("Bcom");
		c1.setFees(5000);
		ss.save(c1);

		College c2 = new College();
		c2.setId(3);
		c2.setCname("prasad");
		c2.setDept("java");
		c2.setFees(50000);
		ss.save(c2);
		
		College c3 = new College();
		c3.setId(2);
		c3.setCname("Maruthi");
		c3.setDept("Bsc");
		c3.setFees(6000);
		ss.save(c3);


		College c4 = new College();
		c4.setId(4);
		c4.setCname("Sai");
		c4.setDept("Bcom");
		c4.setFees(5000);
		ss.save(c4);

		College c5 = new College();
		c5.setId(5);
		c5.setCname("Maruthi");
		c5.setDept("Bsc");
		c5.setFees(6000);
		ss.save(c5);

		College c6 = new College();
		c6.setId(6);
		c6.setCname("prasad");
		c6.setDept("java");
		c6.setFees(50000);
		ss.save(c6);
		tr.commit();
		
		System.out.println("College Data Save");
	}
}
