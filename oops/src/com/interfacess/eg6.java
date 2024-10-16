package com.interfacess;

//6.In Java we can extend a class and implement a interface in same class
//yes 
class F {
	public void m1() {
		System.out.println("m1 method ");
	}
}
interface FF{
	void m2();
}
class FFF extends F implements FF{

	@Override
	public void m2() {
		System.out.println("m2 method ");
		
	}
	
}
public class eg6 {
	public static void main(String[] args) {
		FFF f = new FFF();
		f.m1();
		f.m2();
	}

}
