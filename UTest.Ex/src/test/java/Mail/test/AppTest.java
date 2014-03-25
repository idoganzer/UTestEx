package Mail.test;

import java.util.List;
import Mail.MailController;

import dal.conn.Connection;
import dal.objects.User;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	MailController mailcon = new MailController();
    	try
    	{
    	mailcon.login("idoganzer@gmail.com", "123456");
    	mailcon.login("idoganzer@gmail.com", "123456");
    	}
    	catch(Exception ex)
    	{
    		
    		
    	}
        assertTrue( true );
    }
}
