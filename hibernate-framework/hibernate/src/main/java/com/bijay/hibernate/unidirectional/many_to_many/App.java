package com.bijay.hibernate.unidirectional.many_to_many;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		configuration.addAnnotatedClass(Boy.class);
		configuration.addAnnotatedClass(Girl.class);
		SessionFactory sessionFactory = configuration.buildSessionFactory();

		Set<Girl> girls = new HashSet<>();
		Girl sita = new Girl("Sita");
		girls.add(sita);
		Girl gita = new Girl("Gita");
		girls.add(gita);

		Set<Boy> boys = new HashSet<>();
		Boy ram = new Boy("Ram");
		boys.add(ram);
		Boy shyam = new Boy("Shyam");
		boys.add(shyam);

		ram.setGirls(girls);
		shyam.setGirls(girls);

		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.persist(ram);
		session.persist(shyam);
		session.getTransaction().commit();
		session.close();

		sessionFactory.close();
	}
}
