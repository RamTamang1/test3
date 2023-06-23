package com.takeo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.takeo.pojo.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    //Intailziae the Core Container
    	
    	BeanFactory factory=new XmlBeanFactory(new ClassPathResource("com\\takeo\\config\\spring.xml"));
 Student st=(Student)   	factory.getBean("stu");
    	System.out.println(st.getSno()+"\t"+st.getSname()+"\t"+st.getSadd());
    
    
    }
}
