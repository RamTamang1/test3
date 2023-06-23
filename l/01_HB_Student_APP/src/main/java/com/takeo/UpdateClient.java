package com.takeo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.takeo.pojo.StudentEntity;

public class UpdateClient {

	public static void main(String[] args) {
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
    		Transaction tx = ses.beginTransaction();		// TODO Auto-generated method stub

StudentEntity stu=new StudentEntity();//Transient State
    		
    		
    		stu.setSno(105);
    		stu.setSname("sirisha");
    		stu.setSadd("india");
    		
			/*
			 * StudentEntity s=(StudentEntity)ses.merge(stu);
			 * System.out.println(s.getSno()+"\t"+s.getSname()+"\t"+s.getSadd());
			 * tx.commit();
			 */
    		
    		//ses.saveOrUpdate(stu);
    			
    		ses.update(stu);
    		tx.commit();
    		
    		
    		
    		
    		
    		
	}

}
