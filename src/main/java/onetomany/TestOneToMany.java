package onetomany;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TestOneToMany
{
	public static void main(String[] args)
	{
		Emp e1 = new Emp(1,"Emp1",60000,null);
		Emp e2 = new Emp(2,"Emp2",70000,null);
		Emp e3 = new Emp(3,"Emp3",80000,null);
		Emp e4 = new Emp(4,"Emp4",90000,null);
		Emp e5 = new Emp(5,"Emp5",95000,null);
		
		Employer c1 = new Employer(100,"Xyz","Pune",null);
		Employer c2 = new Employer(200,"PQR","Pune",null);
		
		Set<Emp> setOfEmps1 = new HashSet<Emp>();
		setOfEmps1.add(e1);
		setOfEmps1.add(e2);
		setOfEmps1.add(e3);
		
		c1.setEmployees(setOfEmps1);
		e1.setEmployer(c1);
		e2.setEmployer(c1);
		e3.setEmployer(c1);
		
		
		Set<Emp> setOfEmps2 = new HashSet<Emp>();
		setOfEmps2.add(e4);
		setOfEmps2.add(e5);
		
		c2.setEmployees(setOfEmps2);
		e4.setEmployer(c2);
		e5.setEmployer(c2);
		
		SessionFactory sFactory = HibernateUtil.getSessionFactory();
		Session session = sFactory.openSession();
		Transaction tr = session.beginTransaction();
		session.save(c1);
		session.save(c2);
		session.flush();
		tr.commit();
		
	}

}
