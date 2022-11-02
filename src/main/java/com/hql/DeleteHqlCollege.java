package com.hql;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class DeleteHqlCollege {

	public static void main(String[] args) {

		
		// Deleting a particular user details.
		
		Session ss = ReferenceCollege.getHqlRecored();
		
		Transaction tr = ss.beginTransaction();
		int id = 6;
		Query<College> query = ss.createQuery(" delete from College where id="+id);
//		if(query>0) {
//			System.out.println("delete");
//		}
//		else {
//
//			System.out.println("Not delete");
//		}
		System.out.println("Deleting a row having the value in a property named 'id' :"+id);
		query.executeUpdate();
		tr.commit();
		
	}

}
