package com.dl.stringss;

public class task11 {
	public static void main(String[] args) {
		String s1 = "java";
		System.out.println(s1.toUpperCase());
		
		String s2 ="PYTHON";
		System.out.println(s2.toLowerCase());
		//delete the string 
		
		String s3 = new String("Hello Java and python");
		StringBuffer sb = new StringBuffer(s3);
		//sb.deleteCharAt(10);
		sb.delete(0, 11);
		System.out.println(sb);
	}

}
