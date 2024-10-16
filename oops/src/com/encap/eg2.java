package com.encap;

public class eg2 extends eg1{
	public static void main(String[] args) {
		eg2 e = new eg2();
		e.setEid(101);
		e.seteName("Nitish");
		e.setEusername("sai2003");
		e.setEmail("sai2003@gmail.com");
		e.setSalary(100000);
		
		System.out.println(e.getEid());
		System.out.println(e.geteName());
		System.out.println(e.getEusername());
		System.out.println(e.getEmail());
		System.out.println(e.getSalary());
	}

}
