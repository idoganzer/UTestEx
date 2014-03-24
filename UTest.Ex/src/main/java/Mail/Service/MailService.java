package Mail.Service;

import dal.conn.Connection;
import dal.conn.IConnection;
import dal.objects.User;


//@Component
public class MailService
{
	//@Autowired
	private IConnection connection;
	
	public MailService()
	{
		connection = new Connection();
		connection.init();
	}

	public User GetUser(String emailAddress, String password)
	{
		return connection.GetUser(emailAddress, password);
	}
	
	
    public void setConnection(IConnection conn)
	{
        this.connection = conn;
    }
}