package com.takeo.pojo;

import java.util.List;

public class College {

	private String cname;
	
	private List<Student> student;

	public void setCname(String cname) {
		this.cname = cname;
	}

	
	
	public void setStudent(List<Student> student) {
		this.student = student;
	}



	public void displayDetails()
	{
		System.out.println("College Name :"+cname);
		System.out.println("Student Info : ");
		
		for(Student student : student)
		{
		System.out.println(student.getSno()+"\t"+student.getSname()+"\t"+student.getSadd());
		}
	}
	
}
