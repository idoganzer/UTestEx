package dal.conn;

import java.util.*;

import dal.objects.*;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.boot.registry.StandardServiceRegistry;

import java.util.Iterator;

import org.hibernate.Query;
import org.hibernate.Session;

public class Connection implements IConnection
{
	private SessionFactory sessionFactory;
	
	public void init()
	{
        try 
        {
            Configuration cfg = new Configuration().configure("hibernate.cfg.xml");         
            StandardServiceRegistryBuilder sb = new StandardServiceRegistryBuilder();
            sb.applySettings(cfg.getProperties());
            StandardServiceRegistry standardServiceRegistry = sb.build();                   
            sessionFactory = cfg.buildSessionFactory(standardServiceRegistry);              
        } 
        catch (Throwable th) 
        {
                System.err.println("SessionFactory creation failed: " + th);
                throw new ExceptionInInitializerError(th);
        }
	}
	
	public User GetUser(String emailAddress, String password)
	{
		Session session = sessionFactory.openSession();
        org.hibernate.Transaction tr = session.beginTransaction();
        
        String strSql ="from User user " +
                       "where emailAddress = :emailAddress" +
                       " and password = :password";
        Query query = session.createQuery(strSql);
        query.setParameter("emailAddress", emailAddress);
        query.setParameter("password", password);
        
        List lst = query.list();
        
        sessionFactory.close();
        
        if(lst.isEmpty())
        	return null;
        
        return (User)lst.get(0);
        
//        lst.
//        for(Iterator it=lst.iterator();it.hasNext();)
//        {
//        	User user=(User)it.next();
//        	users.add(user);
//        }
          
        //tr.commit();

	}
}
