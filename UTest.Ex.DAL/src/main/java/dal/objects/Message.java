package dal.objects;

public class Message 
{
	private int id;
	private String subject;
	private String content;
	private int sourceId;
	private int destinationId;
	private boolean isRead;
	private String sourceEmail;
	private String destinationEmail;

    public Message(String subject, String content, int sourceId, int destinationId) 
    {
    	this.subject = subject;
    	this.content = content;
    	this.sourceId = sourceId;
    	this.destinationId = destinationId;
    	isRead = false;
    }
    
    public Message()
    {
    	
    }
    
    public int getId() 
    {
        return id;
    }
    
    public void setId(int id) 
    {
        this.id = id;
    }

    public String getSubject() 
    {
        return subject;
    }
    
    public void setSubject(String subject) 
    {
    	this.subject = subject;
    }
    
    public String getSourceEmail() 
    {
        return sourceEmail;
    }
    
    public void setSourceEmail(String sourceEmail) 
    {
    	this.sourceEmail = sourceEmail;
    }
    
    public String getDestinationEmail() 
    {
        return destinationEmail;
    }
    
    public void setDestinationEmail(String destinationEmail) 
    {
    	this.destinationEmail = destinationEmail;
    }
    
    public String getContent() 
    {
        return content;
    }
    
    public void setContent(String content) 
    {
    	this.content = content;
    }
    
    private int getSourceId() 
    {
        return sourceId;
    }
    
    private void setSourceId(int sourceId) 
    {
        this.sourceId = sourceId;
    }
    
    private int getDestinationId() 
    {
        return destinationId;
    }
    
    private void setDestinationId(int destinationId) 
    {
        this.destinationId = destinationId;
    }
    
    public boolean getIsRead() 
    {
        return isRead;
    }
    
    public void setIsRead(boolean isRead) 
    {
        this.isRead = isRead;
    }
}
