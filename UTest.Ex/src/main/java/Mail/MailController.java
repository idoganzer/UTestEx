package Mail;

import java.util.*;

import dal.objects.User;
import Mail.Service.*;

import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Scope("singleton")
public class MailController 
{
	Map<String, String> usersTokens = new HashMap<String, String>(); 
	MailService mailService;
	
	public MailController()
	{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		mailService = context.getBean(MailService.class);
		//mailService = new MailService();
		
        context.close();
	}
	
    @RequestMapping("/login")
    public @ResponseBody String login(
            @RequestParam(value="emailAddress", required=true) String emailAddress,
            @RequestParam(value="password", required=true) String password) throws Exception
    {
    	User user = mailService.GetUser(emailAddress, password);
    	
    	if(user == null)
    	{
    		throw new Exception("Wrong User name or Password");
    	}
    	
    	String userId = String.valueOf(user.getId());
    	
    	if(usersTokens.containsKey(userId))
    	{
    		throw new Exception("User already logged in");
    	}

    	String guid = java.util.UUID.randomUUID().toString();
    	usersTokens.put(userId, guid);
    	return userId + ":" + guid;
    }
    
    @RequestMapping("/find")
    public @ResponseBody List<Message> find(
            @RequestParam(value="query", required=true) String query)
    {
        return new LinkedList<Message>();
    }
    
    @RequestMapping("/getUnreadMessages")
    public @ResponseBody List<Message> getUnreadMessages()
    {
        return new LinkedList<Message>();
    }
    
    @RequestMapping("/sendMessage")
    public @ResponseBody void sendMessage(
            @RequestParam(value="emailAddress", required=true) String emailAddress,
            @RequestParam(value="subject", required=true) String subject,
            @RequestParam(value="content", required=true) String content)
    {
        
    }
}
