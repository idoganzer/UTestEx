package dal.objects;

public class User 
{
	private int id;
	private String emailAddress;
	private String password;

    public User() 
    {

    }
    
    public User(int id, String emailAddress, String password) 
    {
    	this.id = id;
    	this.emailAddress = emailAddress;
    	this.password = password;
    }

    public int getId() 
    {
        return id;
    }
    
    public void setId(int id) 
    {
        this.id = id;
    }
    
    public String getEmailAddress() 
    {
        return emailAddress;
    }
    
    public void setEmailAddress(String emailAddress) 
    {
        this.emailAddress = emailAddress;
    }
    
    public String getPassword() 
    {
        return password;
    }
    
    public void setPassword(String password) 
    {
        this.password = password;
    }
}
