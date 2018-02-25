package manytomanyunidirectional;

import org.hibernate.Session;

public class TestManyToManyUnidirectional
{
	public static void main(String[] args)
	{
		Student student1 = new Student("abc","pqr");
        Student student2 = new Student("lmn", "xyz");
         
        Subject subject1 = new Subject("Computer");
        Subject subject2 = new Subject("Mechanical");
        Subject subject3 = new Subject("IT");
 
        //Student1 have 3 subjects
        student1.getSubjects().add(subject1);
        student1.getSubjects().add(subject2);
        student1.getSubjects().add(subject3);
         
        //Student2 have 2 subjects
        student2.getSubjects().add(subject1);
        student2.getSubjects().add(subject2);
 
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
 
        session.persist(student1);
        session.persist(student2);
         
        session.getTransaction().commit();
        session.close();
		
	}

}
