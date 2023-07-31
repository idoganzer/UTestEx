import dal.objects.Message;
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
    	Connection conn = new Connection();
    	conn.init();
    	//Message ms = new Message("AAA","BBBBBB",1,1);
    	//conn.SendMessage(ms);
    	//User user = conn.GetUser("idoganzer@gmail.com", "123456");
    	List<Message> lst = conn.GetUnreadMessages(1);
        assertTrue( true );
    }
}
