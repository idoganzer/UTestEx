package Mail.Service;

import java.util.List;
import dal.conn.IConnection;
import dal.objects.*;

public class MailService
{
	private IConnection connection;
	
	public void setConnection(IConnection conn)
	{
        this.connection=conn;
        this.connection.init();
    }

	private User GetUser(String emailAddress, String password)
	{
		return connection.GetUser(emailAddress, password);
	}
	
	public String Login(String emailAddress, String password) throws Exception
	{
    	User user = GetUser(emailAddress, password);
    	
    	if(user == null)
    	{
    		throw new Exception("Wrong User name or Password");
    	}

    	int userId = user.getId();
    	
    	UserToken currentToken = connection.GetUserToken(userId);
    	if(currentToken != null)
    		throw new Exception("User already logged in");

    	UserToken newToken = new UserToken(userId,java.util.UUID.randomUUID().toString());
    	connection.SaveUserToken(newToken);

    	return newToken.getToken();
	}
	
	public UserToken GetUserToken(String token)
	{
		return connection.GetUserToken(token);
	}
	
	public void SendMessage(int sourceId ,String destEmailAddress, String subject, String content) throws Exception
	{
		User destUser = this.GetUser(destEmailAddress, null);
		
		if(destUser != null)
		{
			Message newMsg = new Message(subject, content, sourceId,destUser.getId());
			connection.SaveMessage(newMsg);
		}
		else
		{
			throw new Exception("Can't find destination email address");
		}
	}
	
    public List<Message> getUnreadMessages(int userId)
    {
        return connection.GetUnreadMessages(userId);
    }
    
    public List<Message> Find(int userId, String query)
    {
    	return connection.Find(userId, query);
    }

}