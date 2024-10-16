package com.interfacess;
////Interface:
//In Interface we can have only abstract methods
//Interface can be implemented by using implements keyword
//From Java 8, we can have default and static methods in an interface
//From 9, 10, ...
        //some implementeions 
        //1.In Interface we declare all the abstract methods by default they are public abstract
		//2.In Interface all the variables must be public static final by default
		//3.If a class implements more than interface, then we can separate them by comma
		//4.In some of the cases, we don't want to implement all the abstract methods in interface
		//5.In Java for normal class we cannot extend both the classes (multiple inheritance not supported) So, in interface it is possible
		//6.In Java we can extend a class and implement a interface in same class
interface A{
	void m1();
	public abstract void m2();
	public void m3();
	void m4();
	//1.In Interface we declare all the abstract methods by default they are public abstract
}
class AA implements A{

	@Override
	public void m1() {
		System.out.println("hi this m1 method");
		
	}

	@Override
	public void m2() {
		System.out.println("hi this m2 method");
		
	}

	@Override
	public void m3() {
		System.out.println("hi this m3 method");
		
	}

	@Override
	public void m4() {
		System.out.println("hi this m4 method");
		
	}
	
}
public class eg1 {
	//In Interface we declare all the abstract methods by default they are public abstract
	public static void main(String[] args) {
		AA e = new AA ();
		e.m1();
		e.m2();
		e.m3();
		e.m4();
		
	}
	
	

}
