package com.takeo.pojo;

public class College {

	private String cname;
	
	private Student student;

	public void setCname(String cname) {
		this.cname = cname;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	
	public void displayDetails()
	{
		System.out.println("College Name :"+cname);
		System.out.println("Student Info : ");
		System.out.println(student.getSno()+"\t"+student.getSname()+"\t"+student.getSadd());
	}
	
}
