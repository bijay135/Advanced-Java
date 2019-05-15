package com.bijay.hibernate.unidirectional.one_to_many;

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

		List<Girl> girls = new ArrayList<>();
		Girl sita = new Girl("Sita");
		girls.add(sita);
		Girl gita = new Girl("Gita");
		girls.add(gita);

		Boy ram = new Boy("Ram");
		ram.setGirls(girls);

		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.persist(ram);
		session.getTransaction().commit();
		session.close();

		sessionFactory.close();
	}
}
