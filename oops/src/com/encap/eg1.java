package com.encap;
//Encapsulation 
//Encapsulation is the process wrapping the data and their method into a single unit 
//Note:In Encapsulation we have private properties , setters and getters 
//it being of the projects it used very project

public class eg1 {
	private int eid ;
	private String eName;
	private String eusername;
	private String email;
	private double salary;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	
	public String getEusername() {
		return eusername;
	}
	public void setEusername(String eusername) {
		this.eusername = eusername;
	}
	

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	

}
