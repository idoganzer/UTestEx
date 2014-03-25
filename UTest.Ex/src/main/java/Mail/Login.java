package Mail;

public class Login 
{
	private String _token;

    public Login(String token) 
    {
        _token = token;
    }

    public String getToken() 
    {
        return _token;
    }
}
