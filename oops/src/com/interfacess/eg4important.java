package com.interfacess;
//4.In some of the cases, we don't want to implement all the abstract methods in interface
interface D{
	void m1();
	void m2();
	void m3();
	void m4();
	
}
abstract class DD implements D{
	public void m1() {
		System.out.println("This is top model");
	}
	public void m2() {
		System.out.println("This is three model");
	}
} 

class DDD extends DD{

	@Override
	public void m3() {
		System.out.println("This is seconds model");
		
	}

	@Override
	public void m4() {
		System.out.println("This is base model");
		
	}
	
}
public class eg4important {
	public static void main(String[] args) {
		DDD d = new DDD();
		d.m1();
		d.m2();
	}

}
