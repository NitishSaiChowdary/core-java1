package com.interfacess;

//5.In Java for normal class we cannot extend both the classes (multiple inheritance not supported) So, in interface it is possible
interface E{
	void m1();
	void m2();
}
interface EE{
	void m3();
	void m4();
}
//multiple inheritance not supported, but multiple interface is supported
//interface EEE extends E , EE{
	
//}

class EEE implements  E , EE{

	@Override
	public void m3() {
		System.out.println("m3");
		
	}

	@Override
	public void m4() {
		System.out.println("m4");
	}

	@Override
	public void m1() {
		
		System.out.println("m1");
	}

	@Override
	public void m2() {
		
		System.out.println("m2");
	}
	
}
public class eg5veryimp {
	public static void main(String[] args) {
		EEE e = new EEE();
		e.m1();
		e.m2();
		e.m3();
		e.m4();
	}
	

}
