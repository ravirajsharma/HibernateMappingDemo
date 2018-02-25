package manytooneunidirectional;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil
{
	private static SessionFactory sessionFactory = null;
	
	public static SessionFactory getSessionFactory()
	{
		if(sessionFactory == null)
		{
			sessionFactory = new Configuration().configure().buildSessionFactory();
			System.out.println("SessionFactory object created....");
		}
		
		return sessionFactory;
	}
	
	public static void closeSessionFactory()
	{
		sessionFactory.close();
		System.out.println("SessionFactory closed....");
	}

}
