package com.takeo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.takeo.pojo.StudentEntity;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	//Step 1: Create Configuration Object
    	Configuration cfg= new Configuration();
    	System.out.println(cfg.getProperty("hibernate.connection.driver_class"));
    	cfg.configure("com\\takeo\\config\\hibernate.cfg.xml");
    	System.out.println(cfg.getProperty("hibernate.connection.driver_class"));

    //Step 2:  Build SessionFactory
    		SessionFactory factory=cfg.buildSessionFactory();
    		
    //Step 3:Open The Session
    		Session ses=factory.openSession();
    	//Transaction
    		Transaction tx = ses.beginTransaction();
    		
    		StudentEntity stu=new StudentEntity();//Transient State
    		
    		
    		stu.setSno(103);
    		stu.setSname("manisha");
    		stu.setSadd("usa");
    		
			/*
			 * Integer id=(Integer) ses.save(stu);//persistence State
			 * System.out.println(id);
			 */	
    		ses.persist(stu);
    		tx.commit();
    		
    		System.out.println(ses.contains(stu));//true
    		ses.evict(stu);//Detached state
    		System.out.println(ses.contains(stu));//false
    		
    		ses.close();
    		factory.close();
    		
    		
    		
    		
    		
    		
    	
    
    
    }
}
