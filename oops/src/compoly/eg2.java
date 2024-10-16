package compoly;
//Method Overriding -two class and method name must same but arg must be same 
//the jvm take the responsobile to call the object type 
class Parent{
	void m1(int a,int b,int c) {
		System.out.println("M1 method A: " +(a+b)*c);
	}
		}
class Child extends Parent{
	void m1(int a,int b,int c) {
		System.out.println("M2 method B: " +(a+b)/c);
	}
		}

public class eg2 {
	public static void main(String[] args) {
		Child c = new Child();
		c.m1(100, 200, 2);
     	Parent p=new Parent();
		p.m1(100, 20, 3);
	}

}
