package entities;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;
import java.util.Iterator; 
import org.hibernate.HibernateException; 


public class Main {
	private static SessionFactory sessionFactory;
	
	public static void main(String[] args) {
		try {
			sessionFactory = new Configuration().configure("hibernate.cfg.xml")
					.buildSessionFactory();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		Main U = new Main();
		
		//U.userInsert();
		//U.userList();
		//U.userUpdate(23, "iuliana", "1234");
		//U.userDelete(24);
	}
		
	public void userInsert()
	{
		//Inserting Student Records
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		User user = new User();
		user.setUsername("IULIANA");
		user.setPassword("PASS");
		session.save(user);
		tx.commit();
		System.out.println("Inserted Student details");
		if (session != null)
		session.close();	
	}
	
	public void userList( )
	{
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		try
		{
			tx = session.beginTransaction();
			List users = session.createQuery("FROM User ").list(); 
			for (Iterator iterator = users.iterator(); iterator.hasNext();)
			{
				User user = (User) iterator.next(); 
				System.out.println("Username: " + user.getUsername() + " Password: " + user.getPassword()); 
		    }
			tx.commit();
		}
		catch (HibernateException e) 
		{
			if (tx!=null) tx.rollback();
			e.printStackTrace(); 
		}
		finally 
		{
			session.close(); 
		}
	}

	public void userUpdate(Integer userId, String username, String password)
	{
	      Session session = sessionFactory.openSession();
	      Transaction tx = null;
	      try
	      {
	         tx = session.beginTransaction();
	         User user = (User)session.get(User.class, userId); 
	         user.setUsername( username );
	         user.setPassword( password );
			 session.update(user); 
	         tx.commit();
	      }
	      catch (HibernateException e) 
	      {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      }
	      finally 
	      {
	         session.close(); 
	      }
	   }

   	public void userDelete(Integer userId)
   	{
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try
        {
           tx = session.beginTransaction();
           User user = (User)session.get(User.class, userId); 
           session.delete(user); 
           tx.commit();
        }
        catch (HibernateException e) 
        {
           if (tx!=null) tx.rollback();
           e.printStackTrace(); 
        }
        finally 
        {
           session.close(); 
        }
     }
}