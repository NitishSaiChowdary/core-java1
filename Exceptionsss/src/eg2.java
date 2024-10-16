
public class eg2 {
	public static void main(String[] args) {
	//Runtime errors
    //task1:ArrayIndexOutOfBoundsException
	try {
		int a[]= {10,20,30,40,50,60};
		System.out.println(a[10]);
	} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println(e);
	}
	System.out.println("Distance b/w moon and earth");
	System.out.println("Distance b/w sun and earth");
   //task2:ArithmeticException
	try {
		int b = 100/0;
		System.out.println(b);
	} catch (ArithmeticException e) {
		System.out.println(e);
	}
	//task3:NullPointerException
	try {
		String s1 ="10038485";
		System.out.println(s1.length());
	} catch (NullPointerException e) {
		System.out.println(e);
	}
	//task4:NumberFormatException
	try {
		String s11="Ten";
		int i = Integer.parseInt(s11);	
		System.out.println(i);
		
	} catch (NumberFormatException e) {
		System.out.println(e);
	}
//	task5:StringIndexOutOfBoundsException
	try {
		String s12 ="java and python ";
		char CharAt=s12.charAt(16);
		System.out.println(CharAt);
    	} catch (StringIndexOutOfBoundsException e) {
	    System.out.println(e);
	}
	
   }
}
