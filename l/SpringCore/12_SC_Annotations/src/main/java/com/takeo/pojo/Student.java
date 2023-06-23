package com.takeo.pojo;

import org.springframework.beans.factory.annotation.Required;

public class Student {
	
	
	private int sno;
	private String sname;
	private String sadd;
	public int getSno() {
		return sno;
	}
@Required
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	@Required
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	public String getSadd() {
		return sadd;
	}
	
	@Required
	public void setSadd(String sadd) {
		this.sadd = sadd;
	}
	
	
	

}
