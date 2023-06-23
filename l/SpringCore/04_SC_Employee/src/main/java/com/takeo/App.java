package com.takeo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.takeo.pojo.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    BeanFactory factory=new XmlBeanFactory(new ClassPathResource("\\com\\takeo\\config\\spring.xml"));
    
    Employee e=(Employee)factory.getBean("emp1");
    System.out.println(e.getEno()+"\t"+e.getEname()+"\t"+e.getSadd()+"\t"+e.getSal());
    }
}
