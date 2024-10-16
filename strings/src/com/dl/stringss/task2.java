package com.dl.stringss;

public class task2 {
	//6.diff b/w equals()method and ==reference Operator 
	//equals method will check the content comparion 
	//== will check the reference comparion 
	public static void main(String[] args) {
		String a1 ="hello";
		String a2 ="hello";
		System.out.println(a1.equals(a2));//true	
		System.err.println(a1 == a2);//true
		
		
		String s1 = new String("java");
		String s2 = new String("java");
		System.out.println(s1.equals(s2));//true
		System.err.println(s1 == s2);//false
		
	}

	

}
