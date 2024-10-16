package com.dl.stringss;

public class task8 {
	public static void main(String[] args) {
		//StratsWith() and endsWith()
		String s1 = new String("java and Python");
		System.out.println(s1.startsWith("j"));//true
		System.out.println(s1.startsWith("python"));//flase
		System.out.println(s1.endsWith("a"));//flase
		System.out.println(s1.endsWith("n"));//true
		
		System.out.println(s1.endsWith(" "));//flase
		
		//contains()
		System.out.println(s1.contains("and"));//true
		System.out.println(s1.contains("is"));//flase
		System.out.println(s1.contains("Python"));//ture
		
		//charAt()
		String s2 = new String("python");
		System.out.println(s2.charAt(0));
		System.out.println(s2.charAt(5));
	}

}
 