package Mail.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;

import Mail.MailController;
import Mail.Service.MailService;
import dal.conn.Connection;
import dal.objects.User;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Unit test for simple App.
 */
@RunWith(JUnit4.class)
public class AppTest 
{
	static MailService mailService;
	
	@BeforeClass 
	public static void Init()
	{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        mailService = context.getBean(MailService.class);
        context.close();
	}
	
    @Test
    public void GetUserByEmail()
    {
    	try
    	{
    		String token = mailService.Login("idoganzer@gmail.com", "123456");
    		assertTrue((token!= null) && (!token.isEmpty()));
    	}
    	catch(Exception e)
    	{
    		fail(e.getMessage());
    	}
    }
}
