package dal.conn;

import java.util.*;
import dal.objects.*;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.Query;
import org.hibernate.Session;

public class Connection implements IConnection
{
	private SessionFactory sessionFactory;
	
	public void init()
	{
        try 
        {
        	// Session factory creation
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
	
	// Get user by email and password
	// if password parameter is null -> search only by email
	public User GetUser(String emailAddress, String password)
	{
		Session session = sessionFactory.openSession();

        String strSql ="from User user " +
                       "where emailAddress = :emailAddress";
        
        if(password != null)
        	strSql = strSql + " and password = :password";

        Query query = session.createQuery(strSql);
        query.setParameter("emailAddress", emailAddress);
        
        if(password != null)
        	query.setParameter("password", password);
        
        List lst = query.list();

        session.close();

        if(lst.isEmpty())
        	return null;
        
        return (User)lst.get(0);
	}
	
	public void SaveMessage(Message msg)
	{
		Session session = sessionFactory.openSession();
        session.beginTransaction();
        
        session.save(msg); 
 
        session.getTransaction().commit();
        session.close();
	}
	
	public void SaveUserToken(UserToken ut)
	{
		Session session = sessionFactory.openSession();
        session.beginTransaction();
        
        session.save(ut); 
 
        session.getTransaction().commit();
        session.close();
	}
	
	public List<Message> GetUnreadMessages(int userId)
	{
		Session session = sessionFactory.openSession();
        
        String strSql ="from Message msg " +
                       "where destinationId = :destinationId"
                       + " and isRead = FALSE";
        
        Query query = session.createQuery(strSql);
        query.setParameter("destinationId", userId);
        
        List lst = query.list();

        session.close();
        
        List<Message> msgList = new LinkedList<Message>();
        msgList.addAll(lst);
        
        return msgList;
	}
	
	// Search text in subject or content of the user messages
	public List<Message> Find(int userId, String text)
	{
		Session session = sessionFactory.openSession();
        
        String strSql ="from Message msg " +
                       "where destinationId = :userId " +
        		       "and (subject like :text"+
                       " or content like :text)";
        
        Query query = session.createQuery(strSql);
        query.setParameter("userId", userId);
        query.setParameter("text", "%" + text + "%");

        List lst = query.list();

        session.close();
        
        List<Message> msgList = new LinkedList<Message>();
        msgList.addAll(lst);
        
        return msgList;
	}

	public UserToken GetUserToken(int userId) 
	{
		Session session = sessionFactory.openSession();
        
        String strSql ="from UserToken " +
                       "where id = :userId";
        
        Query query = session.createQuery(strSql);
        query.setParameter("userId", userId);
        
        List lst = query.list();

        session.close();
        
        if(!lst.isEmpty())
        	return (UserToken)lst.get(0);
        
        return null;
	}

	public UserToken GetUserToken(String token) 
	{
		Session session = sessionFactory.openSession();
        
        String strSql ="from UserToken " +
                       "where token = :token";
        
        Query query = session.createQuery(strSql);
        query.setParameter("token", token);
        
        List lst = query.list();

        session.close();
        
        if(!lst.isEmpty())
        	return (UserToken)lst.get(0);
        
        return null;
	}
}
