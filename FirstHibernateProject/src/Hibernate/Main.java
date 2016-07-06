package Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.fasterxml.classmate.AnnotationConfiguration;

public class Main {
	
	public static void main(String[] args)
	{
		Student_Info student = new Student_Info();
		
		student.setName("Test");
		student.setRollNo(1);
		
		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(student);
		
		session.getTransaction().commit();
		session.close();
	}
}
