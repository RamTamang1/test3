package com.takeo.pojo;

public class Employee {
	private int eno;
	private String ename;
	
	private int sal;
	private String sadd;
	public Employee(int eno, String ename) {
		super();
		this.eno = eno;
		this.ename = ename;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getSadd() {
		return sadd;
	}
	public void setSadd(String sadd) {
		this.sadd = sadd;
	}
	public int getEno() {
		return eno;
	}
	public String getEname() {
		return ename;
	}
	public Employee(int eno, String ename, int sal, String sadd) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.sal = sal;
		this.sadd = sadd;
	}
	
	
	

}
