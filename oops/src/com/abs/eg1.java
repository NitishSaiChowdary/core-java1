package com.abs;
//abs -hiding the data and highlighting the set of services
//task1:abs contains abs methods and non abs method (concrete method) 
abstract class A{
	public void m1() {
		System.out.println("m1 method");
	}
	public abstract void m2();
}
class B extends A{

	@Override
	public void m2() {
		System.out.println("m2 method");
		
	}
	
}
public class eg1 {
	public static void main(String[] args) {
		
		//object is store in heap area---new B();
		//object reference store in stack area ---b
		B b =new B();
		b.m1();
		b.m2();
		
	}

}
