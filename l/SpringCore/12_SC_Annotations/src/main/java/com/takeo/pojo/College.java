package com.takeo.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class College {

	private String cname;
	
	@Qualifier("student1")
	@Autowired
	private Student student;

	public void setCname(String cname) {
		this.cname = cname;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	
	public void displayDetails()
	{
		System.out.println("College Name : "+cname);
		
		System.out.println("Student Information : ");
		System.out.println(student.getSno()+"\t"+student.getSname()+"\t"+student.getSadd());
	}
	
	
}
