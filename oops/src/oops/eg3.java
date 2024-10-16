package oops;
class GrandParent{
	void m1() {
		System.out.println("m1 method");
	}
	
}
class Parent extends GrandParent{
	void m2() {
		System.out.println("m2 method");
	}
	
}
class Child extends GrandParent{
	void m3() {
		System.out.println("m3 method");
	}
	
}
public class eg3 {
	public static void main(String[] args) {
		Child c = new Child();
		c.m3();
		c.m1();
		
		Parent p = new Parent();
		p.m2();
		p.m1();
		
	}

}
