package com;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class DeleteEmployee {

	public static void main(String[] args) {
		Session se = ReferenceEmployee.getRecored();
		Transaction tx = se.beginTransaction();
		Maruthi em = (Maruthi)se.get(Maruthi.class, new Integer(3));
		
		se.delete(em);
		tx.commit();
		System.out.println("Record Will be Deleted");
	}
}
