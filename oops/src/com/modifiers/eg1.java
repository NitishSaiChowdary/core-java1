package com.modifiers;

    //Modifiers: 
	//Public : We can access same package and other package
	//Private : We can access only in same class, we cannot call it in other classes
public class eg1 {
	private int eid = 101;
	private String ename = "sai kiran";
	private String eusername ="sai2004";
	private String emailid = "sai@gmail.com";
	private double salary = 10000.00;
	
	
	
	public static void main(String[] args) {
		
		
		eg1 p = new eg1 ();
		System.out.println(p.eid);
		System.out.println(p.ename);
		System.out.println(p.eusername);
		System.out.println(p.emailid);
		System.out.println(p.salary);
		
	}

}
