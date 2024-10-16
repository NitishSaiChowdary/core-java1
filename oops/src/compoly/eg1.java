package compoly;
//ploy-many forms
//Method Overloading-complite time - static binding - eagerly binding 
//one class and multiple method but arg must be different 
//the method which argment should be call 

public class eg1 {
	public void m1(int a,int b) {
		System.out.println(a);
		System.out.println(b);
		
	}
	public void m1(int a,int b,int c) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}
	public void m1(int a,int b,float c) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}
	public static void main(String[] args) {
		eg1 e =new eg1();
		e.m1(10,20);
		e.m1(10, 200,300);
		e.m1(200, 2000, 34);
		
	}

}
