package com.ttnd.reap;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ReapConnection_Main {

	public static void main(String[] args) {

		Earning_Kitty earn = new Earning_Kitty();
		Giving_Kitty give = new Giving_Kitty();
		Employee_Detail emp = new Employee_Detail();
		Karma_Reason karm = new Karma_Reason();

		emp.setEmployeeId(1234);
		emp.setEmployeeName("Shefali");
		emp.setEmployeeEmailId("shefalis1269@gmail.com");
		emp.setPassword("abcd1234");
		emp.setServiceLine("technology");
		emp.setPractice("JVM");
		emp.setRole("intern");

		earn.setGold(30);
		earn.setSilver(15);
		earn.setBronze(10);
		earn.setEmployeeId(emp.getEmployeeId());

		give.setGold(3);
		give.setSilver(1);
		give.setBronze(5);
		give.setEmployeeId(emp.getEmployeeId());

		karm.setBadgeReceived("gold");
		karm.setKarma("karma");
		karm.setReason("appreciation for help ");
		karm.setReceiverId("123");
		karm.setSenderId("ajay123");
		karm.setDateTime(new Date());

		Session session = null;
		Transaction transaction = null;
		try {
			Configuration configuration = new Configuration().configure();
			SessionFactory sessionFactory = configuration.buildSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			session.save(emp);
			session.save(give);
			session.save(earn);
			session.save(karm);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
		} finally {
			session.close();
		}

	}
}
