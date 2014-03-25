package Mail;

import java.util.*;

import dal.objects.User;
import Mail.Service.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@Configuration
//@ComponentScan(value={"Mail.Service"})
public class MailController 
{
	Map<String, String> usersTokens = new HashMap<String, String>(); 
	MailService mailService;
	
	public MailController()
	{
		//AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MailController.class);
		//mailService = context.getBean(MailService.class);

        //close the context
        //context.close();
		
		mailService = new MailService();
	}
	
//	@Bean
//    IConnection getIConnection()
//	{
//        return new Connection();
//    }
	
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

    	usersTokens.put(userId, java.util.UUID.randomUUID().toString());
    	return userId + ":" + java.util.UUID.randomUUID().toString();
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
