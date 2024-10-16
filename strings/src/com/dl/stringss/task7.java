package com.dl.stringss;

public class task7 {
public static void main(String[] args) {
	//compareTo()
	String s1 =new String("A");
	String s2 = new String("B");
	String s3 = new String("C");
	String s4 = new String("a");
	System.out.println(s1.compareTo(s2));//-1 //65-66=-1
	System.out.println(s1.compareTo(s3));//-2 //65-67=-2
	System.out.println(s2.compareTo(s3));//-1 //66-67=-1
	System.out.println(s4.compareTo(s1));//32 //97-65=32
	
	
	//compareToIgnoreCase();
	System.out.println(s4.compareToIgnoreCase(s1));//0 //65-65=32
	

}
}
