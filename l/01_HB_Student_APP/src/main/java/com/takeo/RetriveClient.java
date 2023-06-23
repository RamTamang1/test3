package com.takeo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.takeo.pojo.StudentEntity;

public class RetriveClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
    		
    		StudentEntity stu=null;
    		try {
				/* stu = ses.load(StudentEntity.class,250); */
    			
    			 stu =   		ses.get(StudentEntity.class,100);
				 if(stu!=null)
					 System.out.println(stu.getSno()+"\t"+stu.getSname()+"\t"+stu.getSadd());
				 else
					 System.out.println("given Record not Exisit");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Given Record not Found");
			//	e.printStackTrace();
			}
    	
    		
	}

}
