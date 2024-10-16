package com.dl.stringss;

public class task10 {
public static void main(String[] args) {
	
	//indexOf() and lastindexOf();
	String s1 = new String("hello java learners and hello python learner and hello css ");
	System.out.println(s1.replaceAll("hello", "hey"));
	
	
	System.out.println(s1.lastIndexOf("hello"));//49
	System.out.println(s1.lastIndexOf("hey"));//-1
	System.out.println(s1.indexOf("hello"));//0
	System.out.println(s1.indexOf("hello",8));//24
	
	//subString();
	String s2 = "javaiseasyprogramingifyouhavegoodtime";
	System.out.println(s2.substring(0, 10));//javaiseasy
	System.out.println(s2.substring(10, 20));//programing
	
	
	
	
	
}
}
