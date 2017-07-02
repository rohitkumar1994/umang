package in.spicedigital.angular.config;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ApplicationContextProvider  implements ApplicationContextAware{
	@Override   
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
	        AppContext.setContext(ctx);
	    }
}
