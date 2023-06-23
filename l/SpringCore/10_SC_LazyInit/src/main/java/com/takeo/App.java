package com.takeo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//Intialize the Core Container
    	
    	ApplicationContext factory=new ClassPathXmlApplicationContext("com\\takeo\\config\\spring.xml");
    	
    	factory.getBean("sb");
    
    
    
    }
}
