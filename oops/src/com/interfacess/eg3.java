package com.interfacess;

//3.If a class implements more than one interface, then we can separate them by comma
interface C{
	void m1();
}
interface CC{
	void m2();
	
}
class CCC implements C ,CC{

	@Override
	public void m2() {
		System.out.println("Hi this M2 method+");
		
	}

	@Override
	public void m1() {
		System.out.println("Hi this M1 method+");
		
	}
	
}

public class eg3 {
	public static void main(String[] args) {
		CCC c= new CCC();
		c.m1();
		c.m2();
	}

}
