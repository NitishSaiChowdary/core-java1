package com.thiskeyword;
//3.this() constructor to invoke current class constructor
public class eg3 {
	
	public eg3() {
		this(101,"nitish");//Constructor call must be the first statement in a constructor
		System.out.println("default cons");
		
	}
	public eg3(int id, String username) {
		System.out.println("Id is: " +id );
		System.out.println("userName is:" +username);
	}
	public static void main(String[] args) {
		new eg3();
	}

}
