package Mail;

import java.util.*;
import Mail.Service.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import dal.objects.Message;

@Controller
public class MailController 
{
	MailService mailService;
	
	public MailController()
	{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		mailService = context.getBean(MailService.class);
        context.close();
	}
	
    @RequestMapping("/login")
    public @ResponseBody String login(
            @RequestParam(value="emailAddress", required=true) String emailAddress,
            @RequestParam(value="password", required=true) String password) throws Exception
    {
    	return mailService.Login(emailAddress, password);
    }
    
    @RequestMapping("/Mail/find")
    public @ResponseBody List<Message> find(
    		@Value("#{request.getAttribute('UserId')}") int userId,
    		@RequestHeader(value="Token") String reqToken,
            @RequestParam(value="query", required=true) String query) throws Exception
    {
        return mailService.Find(userId, query);
    }
    
    @RequestMapping("/Mail/getUnreadMessages")
    public @ResponseBody List<Message> getUnreadMessages(
    		@Value("#{request.getAttribute('UserId')}") int userId,
    		@RequestHeader(value="Token") String reqToken) throws Exception
    {
        return mailService.getUnreadMessages(userId);
    }
    
    @RequestMapping("/Mail/sendMessage")
    public @ResponseBody void sendMessage(
    		@Value("#{request.getAttribute('UserId')}") int userId,
            @RequestParam(value="emailAddress", required=true) String emailAddress,
            @RequestParam(value="subject", required=true) String subject,
            @RequestParam(value="content", required=true) String content) throws Exception
    {
    	mailService.SendMessage(userId, emailAddress, subject, content);
    }
}
