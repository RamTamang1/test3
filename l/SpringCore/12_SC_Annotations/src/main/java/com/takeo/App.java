package com.takeo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.takeo.pojo.College;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
 //Intailziae the Core Container
    	
    	ApplicationContext factory=new ClassPathXmlApplicationContext("com\\takeo\\config\\spring.xml");
 College clg=(College)   	factory.getBean("clg");
    	
 clg.displayDetails();
 
    }
}
