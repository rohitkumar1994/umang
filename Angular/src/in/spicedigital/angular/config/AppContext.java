package in.spicedigital.angular.config;

import java.util.Properties;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;

public class AppContext {

	    private static ApplicationContext context;
	    public static ApplicationContext getContext() {
	        return context;
	    }
		public static void setContext(ApplicationContext context)
				throws BeansException {
			AppContext.context=context;
			PropertyConfiguration.setConfiguration((Properties)AppContext.getContext().getBean("configuration"));

		}
}
