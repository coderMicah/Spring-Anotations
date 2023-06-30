package com.micah.springannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
		/*XML BASED CONFIGURATION
		 * 
		 * ApplicationContext context = new
		 * ClassPathXmlApplicationContext("spring.xml"); Samsung s7 = (Samsung)
		 * context.getBean("samsung"); s7.config();
		 * 
		 * Tecno j1 = (Tecno) context.getBean("tecno"); j1.config();
		 */
    	
//    	ANNOTATION BASED CONFIGURATION
    	ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
    	Samsung s7 = factory.getBean(Samsung.class);
    	s7.config();
    	
    	Tecno j1 = factory.getBean(Tecno.class);
    	j1.config();
    	
    }
}
