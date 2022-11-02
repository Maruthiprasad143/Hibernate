package com.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

public class CollegeDetails {

	public static void main(String[] args) {
		Session ss = ReferenceCollege.getHqlRecored();

		List<College> clg = ss.createQuery("from College").list();
		clg.forEach((m) -> System.out.println(
				" Id:" + m.id + "college Name: " + m.cname + "Department: " + m.dept + "College Fees :" + m.fees));
		   
	}

}
