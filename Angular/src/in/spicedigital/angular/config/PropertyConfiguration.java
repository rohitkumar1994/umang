package in.spicedigital.angular.config;


import java.util.Properties;

public class PropertyConfiguration {
	private static Properties configuration;
	private static Properties messageSource;
	public static String getConfiguration(String property){
		return configuration.getProperty(property);
	}
	public static Boolean isConfigurationAvail(String property){
		return configuration.containsKey(property);
	}
	public static  String getMessage(String property){
		return messageSource.getProperty(property);
	}
	public static void setConfiguration(Properties configuration) {
		PropertyConfiguration.configuration = configuration;
	}
	public static void setMessageSource(Properties messageSource) {
		PropertyConfiguration.messageSource = messageSource;
	}
	
}
