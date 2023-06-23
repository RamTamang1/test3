package com.takeo.pojo;

import java.util.List;
import java.util.Set;

public class College {

	private String cname;
	

	private List<String> faculties;
	
	private Set<String> courses;
	
	public void setCname(String cname) {
		this.cname = cname;
	}

	
	
	


	public void setFaculties(List<String> faculties) {
		this.faculties = faculties;
	}






	public void setCourses(Set<String> courses) {
		this.courses = courses;
	}






	public void displayDetails()
	{
		System.out.println("College Name :"+cname);
		System.out.println("Faulty Info : ");
		
		for(String facultyName : faculties)
		{
		System.out.println(facultyName);
		}
		
		System.out.println("Course  Info : ");

		
		for(String courseName : courses)
		{
		System.out.println(courseName);
		}
		
		
		
		
	}
	
}
