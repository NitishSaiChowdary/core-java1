package com.modifiers;


//Protected: We can access in same class, other class and other package but need inheritance


public class eg4 {
	protected int eid = 101;
	protected String ename = "Sai Kiran";
	
	public static void main(String[] args) {
		
		eg4 p = new eg4();
		System.out.println(p.eid);
		System.out.println(p.ename);
	}

}
