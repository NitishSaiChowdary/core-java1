package com.superkey;
//super keyword can be used to invoke parent class method
class AA{
	void m1() {
		System.out.println("m1 method");
	}
	
	
}
class BB extends AA{
	void m2() {
		System.out.println("m2 method");
	}
	void m3() {
		super.m1();
		this.m2();
		System.out.println("m3 method");
	}
	
}
public class eg2 {
	public static void main(String[] args) {
		new BB().m3();
	}

}
