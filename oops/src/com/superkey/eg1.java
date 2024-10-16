package com.superkey;

//super:
//super keyword can be used to refer parent class v
//super keyword can be used to invoke parent class method
//super() can be used to invoke parent class cons
class A{
	int a = 10;//instance variable
	int b = 20;//instance variable
	
}    
class B extends A{
	int a= 100;//instance variable
	int b = 200;//instance variable
	
	public B (int a , int b) {
		System.out.println("parent class: "+super.a);//this will refer to the parent class
		System.out.println("parent class: "+super.b);//this will refer to the parent class
		System.out.println();
		System.out.println("current class instance variable: "+this.a);//this will refer to the current class instance variable
		System.out.println("current class instance variable: " +this.b);//this will refer to the current class instance variable
        System.out.println();
		System.out.println("local variables: " +a);
		System.out.println("local variables: " +b);		
	}
	
	
}
public class eg1 {
	public static void main(String[] args) {
		new B(1000,2000);
		
	}

}
