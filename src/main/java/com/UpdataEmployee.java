package com;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class UpdataEmployee {
	public static void updateEmployee() {
		Session se = ReferenceEmployee.getRecored();
		Transaction tx = se.beginTransaction();
		Maruthi e = new Maruthi();
		e.setId(2);
		e.setName("Update Name");
		se.update(e);
		tx.commit();
		System.out.println("Data updated");
	}

	public static void main(String[] args) {
		updateEmployee();
	}
}
