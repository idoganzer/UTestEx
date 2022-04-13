package Mail;

import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import dal.objects.UserToken;
import Mail.Service.MailService;

public class AuthorizationInterceptor implements HandlerInterceptor  
{
	private MailService mailService;
	private HashMap<String,Integer> usersTokensCache = new HashMap<String,Integer>();
	
	public AuthorizationInterceptor()
	{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		mailService = context.getBean(MailService.class);
        context.close();
	}
	
	// Check if the user token is valid
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception 
	{	
		boolean isValidToken = false;

		String token = request.getHeader("Token");
		
		if((token != null) && !token.isEmpty())
		{
			if(usersTokensCache.containsKey(token))
			{
				isValidToken = true;
				
				// Pass the user id to the requested function
				request.setAttribute("UserId", usersTokensCache.get(token));
			}
			else
			{
				UserToken ut = mailService.GetUserToken(token);
			
				if(ut != null)
				{
					isValidToken = true;
					int userId = ut.getId();
					request.setAttribute("UserId", userId);
					usersTokensCache.put(token, userId);
				}
			}
		}
		
		if(!isValidToken)
			response.sendError(401);
	
		return isValidToken;
	}

	public void postfghjghjHandle(HttpServletRequest request,
	bla bla hello
			HttpServletResponse response, Object handler,
			ModelAndView modefcghjlAndView) asdfghjkl Exception {
		// TODO Auto-generated method stub
		
	}ghjkgvhjk

	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		
	}
}
