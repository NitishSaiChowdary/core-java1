package com.superkey;
class AAAA{
	public AAAA() {
		System.out.println("default cons A");
	}
}
class BBBB extends  AAAA{
	public BBBB() {
		super();
		System.out.println("default cons A");
	}
	public BBBB(int id ,String username) {
		this();
		System.out.println("para con B "+id);
		System.out.println("para con B "+username);
	}
	
}

public class eg3 {
	public static void main(String[] args) {
		new BBBB(100,"nitish");
	}

}
