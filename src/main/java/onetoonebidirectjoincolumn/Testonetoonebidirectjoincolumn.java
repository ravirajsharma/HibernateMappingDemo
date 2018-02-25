package onetoonebidirectjoincolumn;

import org.hibernate.Session;
import org.hibernate.Transaction;

import onetoonebidirectjoincolumn.Address;
import onetoonebidirectjoincolumn.HibernateUtil;
import onetoonebidirectjoincolumn.Student;

public class Testonetoonebidirectjoincolumn
{
	public static void main(String[] args)
	{
		Student student1 = new Student("Mamesh", "MCA");
		Address address1 = new Address("SB road", "Pune", "India");
		
		/*SessionFactory sessionFactory1 = HibernateUtil.getSessionFactory();
		Session session1 = sessionFactory1.openSession();*/
		Session session1 = HibernateUtil.getSessionFactory().openSession();
		
		Transaction transaction1 = session1.beginTransaction();
		
		session1.persist(address1);
		address1.setStudent(student1);
		student1.setStudentAddress(address1);
		session1.persist(student1);
		
		transaction1.commit();
		session1.close();
		HibernateUtil.closeSessionFactory();
		
	}
}
