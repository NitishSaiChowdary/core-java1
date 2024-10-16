package com.dl.stringss;

public class task5 {
	public static void main(String[] args) {
		//10.Different b/w String ,Stringbuilder,Stringbuffer
		//String :immutable 
		//Stringbuilder :mutable,no thread safety
		//StringBuffer :mutable,thread safety
		//Stringbuilde and StringBufferare mutable,if i need thread Saftey we use StringBuffer,if don't need Safety we use Stringbuilder
		//11.Differnce b/w split() and join()method
		//Note: To remember Split() and Join() they work opposite to each other
		String s1="hello";
		StringBuffer s2 =new StringBuffer("hello");
		StringBuilder s3 =new StringBuilder("hello");
		
		s2.append("hi");
		System.out.println(s2);
		
		s3.append("hey");
		System.out.println(s3);
		
		String s = s1.concat("hi");
		System.out.println(s1);
		System.out.println(s);
		
	}
}
