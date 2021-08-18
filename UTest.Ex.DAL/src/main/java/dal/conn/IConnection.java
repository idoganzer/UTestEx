package dal.conn;

import java.util.List;

import dal.objects.*;

public interface IConnection 
{
	public void init();
	public User GetUsers(String emailAddress, String password);
	public void SaveMessage(Message msg);
	public List<Message> GetUnreadMessages(int userId);
	public List<Message> Find(int userId, String query);
	public UserToken GetUserToken(int userId);
	public UserToken GetUserToken(String token);
	public void SaveUserToken(UserToken ut);
}
