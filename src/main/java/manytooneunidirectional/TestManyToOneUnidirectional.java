package manytooneunidirectional;

import org.hibernate.Session;

public class TestManyToOneUnidirectional
{
	public static void main(String[] args)
	{
		Student student1 = new Student("abc","pqr","Computer");
        Student student2 = new Student("lmn", "xyz", "Mechanical");
        Student student3 = new Student("qkn", "ghk", "IT");
         
        University university = new University("Pune", "India");
 
        student1.setUniversity(university);
        student2.setUniversity(university);
        student3.setUniversity(university);
 
 
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
 
        session.persist(university);
        session.persist(student1);
        session.persist(student2);
        session.persist(student3);
        
        session.getTransaction().commit();
        session.close();
		
		
	}

}
