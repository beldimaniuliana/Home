package entities;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
 
public class Example1 {

    public static void main(String[] args) throws Exception {
        /** Getting the Session Factory and session */
        SessionFactory session = HibernateUtil.getSessionFactory();
        Session sess = session.getCurrentSession();
        /** Starting the Transaction */
        Transaction tx = sess.beginTransaction();
        /** Creating Pojo */
        User pojo = new User();
        pojo.setIdUser(new Integer(5));
        pojo.setUsername("XYZ");
        pojo.setPassword("XYZ");
        /** Saving POJO */
        sess.save(pojo);
        /** Commiting the changes */
        tx.commit();
        System.out.println("Record Inserted");  
        /** Closing Session */
        session.close();
    }
 
}
