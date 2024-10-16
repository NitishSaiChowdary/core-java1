package oops;
class A{
	void m1() {
		System.out.println("m1 method");
	}
	
}
class B extends A{
	void m2() {
		System.out.println("m2 method");
	}
	
}
//single level inheritance 
public class eg1 {
	public static void main(String[] args) {
		B b = new B();
		b.m1();
		b.m2();
		
		
	}

}
