package com.interfacess;

//2.In Interface all the variables must be public static final by default
interface B{
	public static final int a =20;
	int b =30;
}
class BB implements B{
	
}
public class eg2 {
	public static void main(String[] args) {
		System.out.println(BB.a);
		System.out.println(BB.b);
	}

}
