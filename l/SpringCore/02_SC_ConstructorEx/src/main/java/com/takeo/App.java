package com.takeo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.takeo.pojo.Greeting;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    BeanFactory factory=new XmlBeanFactory(new ClassPathResource("\\com\\takeo\\config\\spring.xml"));
    
    Greeting g=(Greeting)factory.getBean("gr");
    System.out.println(g.getMessage());
    }
}
