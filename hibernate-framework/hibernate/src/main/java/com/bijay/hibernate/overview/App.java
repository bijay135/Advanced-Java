package com.bijay.hibernate.overview;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args ) {
    	Configuration configuration = new Configuration().configure();
		configuration.addAnnotatedClass(Student.class);
		SessionFactory sessionFactory = configuration.buildSessionFactory();
    	
    	sessionFactory.close();
    }
}
