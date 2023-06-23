package com.takeo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.takeo.pojo.StudentEntity;

public class MergeUsage {

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
    		Transaction tx = ses.beginTransaction();		// TODO Auto-generated method stub

		
		StudentEntity stu = ses.get(StudentEntity.class,600);
		
		if(stu!=null)
		{
			stu.setSadd("usa");
		
		
		StudentEntity s=(StudentEntity)ses.merge(stu);
		System.out.println(s.getSno()+"\t"+s.getSname()+"\t"+s.getSadd());
		}
		else
		{
			stu=new StudentEntity();
			stu.setSno(501);
			stu.setSname("rani");
			stu.setSadd("Hyderabad");
			ses.persist(stu);
		}
		tx.commit();
		
		
		
		
		
		
		
	}

}
