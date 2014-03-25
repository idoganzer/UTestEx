package Mail.Service;

import dal.conn.Connection;
import dal.conn.IConnection;
import dal.objects.User;

public class MailService
{
	private IConnection connection;
	
	public void setConnection(IConnection conn)
	{
        this.connection=conn;
        this.connection.init();
    }

	public User GetUser(String emailAddress, String password)
	{
		return connection.GetUser(emailAddress, password);
	}

}