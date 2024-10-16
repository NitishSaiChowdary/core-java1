package com.abs;

//variable 
abstract class AAA{
	int a= 10;//insta variable s
	int b =20;

	static int x = 10; //static variables 
	static int y = 300;
	
	public void m1() {
		int i = 10000;
		int j = 20000;
		System.out.println(i);
		System.out.println(j);
	}
}
class BBB extends AAA{
	
}
public class eg3 {
	public static void main(String[] args) {
		BBB b = new BBB();
		System.out.println(b.a);//instanic variables call with object reference 
		System.out.println(b.b);
		System.out.println(BBB.x);//static variable must call with class ex- BBB.x ,BBB.y
		System.out.println(BBB.y);
		b.m1(); // local variable call object reference or we can call directly 
	}

}
