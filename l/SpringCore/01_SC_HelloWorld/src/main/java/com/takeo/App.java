package com.takeo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.takeo.pojo.HelloWorld;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//Intialize the Core Container
    	
    	BeanFactory factory=new XmlBeanFactory(new ClassPathResource("com\\takeo\\config\\spring.xml"));
    	
    	 Object bean = factory.getBean("hello");
    	 
    	 HelloWorld hello =(HelloWorld)bean;
    	 
    System.out.println(hello.getMessage());
    
    
    
    
    
    }
}
