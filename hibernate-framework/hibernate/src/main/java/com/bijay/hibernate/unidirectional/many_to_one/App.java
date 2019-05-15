package com.bijay.hibernate.unidirectional.many_to_one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		configuration.addAnnotatedClass(Boy.class);
		configuration.addAnnotatedClass(Girl.class);
		SessionFactory sessionFactory = configuration.buildSessionFactory();

		Boy ram = new Boy("Ram");
		Girl sita = new Girl("Sita");
		sita.setBoy(ram);
		Girl gita = new Girl("Gita");
		gita.setBoy(ram);

		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.persist(sita);
		session.persist(gita);
		session.getTransaction().commit();
		session.close();

		sessionFactory.close();
	}
}
