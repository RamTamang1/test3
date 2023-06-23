package com.takeo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.takeo.pojo.SpringBean;


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
    	
    	SpringBean obj1=(SpringBean)factory.getBean("sb");
    	
    	SpringBean obj2=(SpringBean)factory.getBean("sb");
    	
    	SpringBean obj3=(SpringBean)factory.getBean("sb");
    	
    	SpringBean obj4=(SpringBean)factory.getBean("sb");
    System.out.println(obj1);
    System.out.println(obj2);
    System.out.println(obj3);
    
    
    
    }
}
