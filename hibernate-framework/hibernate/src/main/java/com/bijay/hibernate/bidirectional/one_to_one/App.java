package com.bijay.hibernate.bidirectional.one_to_one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		configuration.addAnnotatedClass(Boy.class);
		configuration.addAnnotatedClass(Girl.class);
		SessionFactory sessionFactory = configuration.buildSessionFactory();

		Girl sita = new Girl("Sita");
		Boy ram = new Boy("Ram");
		ram.setGirl(sita);

		Session session = sessionFactory.openSession();
		session.save(ram);
		session.close();

		sessionFactory.close();
	}
}
