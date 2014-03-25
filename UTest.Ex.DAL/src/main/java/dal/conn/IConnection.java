package dal.conn;

import dal.objects.User;

public interface IConnection 
{
	public void init();
	public User GetUser(String emailAddress, String password);
}
