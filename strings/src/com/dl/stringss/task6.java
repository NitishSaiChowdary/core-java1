package com.dl.stringss;

public class task6 {
	public static void main(String[] args) {
		//11.Different b/w split() and join() method
		//note:TO remember split() and join() they work opposit to each other
		
		//split() method return the array of elements
		String s1 = new String("Hello java and hello python");
		String[] split = s1.split("and ");
		for (String string : split) {
			System.out.println(string);//Hello java 
			// hello python
		}
		
		String s2 = String.join("and ","hello java ","hello python");
		System.out.println(s2);
		//hello java and hello python
	}
}
