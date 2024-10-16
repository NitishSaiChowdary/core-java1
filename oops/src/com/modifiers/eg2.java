package com.modifiers;

//Default Modifier
//We can access only in the same package any where


public class eg2 {
	int eid = 101;
	String ename = "Sai Kiran";
//	private String eusername ="sai2004";
//	private String emailid = "sai@gmail.com";
//	private double salary = 10000.00;
//	
	public static void main(String[] args) {
		
		eg2 p = new eg2();
		System.out.println(p.eid);
		System.out.println(p.ename);
//		System.out.println(p.eusername);
//		System.out.println(p.emailid);
//		System.out.println(p.salary);
		

    }
}
