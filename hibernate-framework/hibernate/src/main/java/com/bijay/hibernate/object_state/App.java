package com.bijay.hibernate.object_state;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) throws InterruptedException {
		Configuration configuration = new Configuration().configure();
		configuration.addAnnotatedClass(Boy.class);
		SessionFactory sessionFactory = configuration.buildSessionFactory();

		// ram is new object
		// shyam is new object
		// ram & shyam becomes managed object after persist method call
		Session session = sessionFactory.openSession();
		Boy ram = new Boy("Sabin");
		Boy shyam = new Boy("Bijay");
		session.beginTransaction();
		session.persist(ram);
		session.persist(shyam);
		session.getTransaction().commit();
		session.close();

		// boy1 is managed object
		// Hibernate updates the changes to database for managed object
		session = sessionFactory.openSession();
		session.beginTransaction();
		Boy boy1 = session.find(Boy.class, 1L);
		boy1.setAddress("Kathmandu");
		session.getTransaction().commit();
		session.close();

		// boy2 is managed object
		// boy2 becomes detached after detach method call
		// Hibernate doesn't update the changes to database for detached object
		session = sessionFactory.openSession();
		session.beginTransaction();
		Boy boy2 = session.find(Boy.class, 1L);
		session.detach(boy2);
		boy1.setAddress("Kathmandu");
		session.getTransaction().commit();
		session.close();

		// boy3 is managed object
		// boy3 becomes removed after remove method call
		// Hibernate removes removed object from database
		session = sessionFactory.openSession();
		session.beginTransaction();
		Boy boy3 = session.find(Boy.class, 1L);
		session.remove(boy3);
		session.getTransaction().commit();
		session.close();

		sessionFactory.close();
	}
}
