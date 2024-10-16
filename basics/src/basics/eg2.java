package basics;
class Parent {

	void m1(int a, int b,int c) {
		System.out.println("M1 method A:" + (a + b)*c);
	}
}

class Child extends Parent {

	void m1(int a, int b , int c) {
		System.out.println("M1 method B: " + (a + b)/c);
	}
}

public class eg2 {
	//Method Overriding

		public static void main(String[] args) {
			
			Child child = new Child();
			child.m1(10, 20,30);
			
			Parent parent = new Child();
			parent.m1(100, 200 ,300);
			
		}
	

}
