package com.bijay.hibernate.bidirectional.one_to_many;

import java.util.ArrayList;
import java.util.List;

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

		List<Girl> girls = new ArrayList<>();
		Girl sita = new Girl("Sita");
		sita.setBoy(ram);
		girls.add(sita);
		Girl gita = new Girl("Gita");
		gita.setBoy(ram);
		girls.add(gita);

		ram.setGirls(girls);

		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.persist(sita);
		session.persist(gita);
		session.getTransaction().commit();
		session.close();

		sessionFactory.close();
	}
}
