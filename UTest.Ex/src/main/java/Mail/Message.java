package Mail;

public class Message 
{
	private String _subject;
	private String _content;
	private String _sourceMail;
	private String _destMail;

    public Message(String subject, String content, String sourceMail, String DestMail) 
    {
    	_subject = subject;
    	_content = content;
    	_sourceMail = sourceMail;
    	_destMail = DestMail;
    }

    public String getSubject() 
    {
        return _subject;
    }
    
    public String getContent() 
    {
        return _content;
    }
    
    public String getSenderMail() 
    {
        return _sourceMail;
    }
    
    public String getDestinationMail() 
    {
        return _destMail;
    }
}
