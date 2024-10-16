package oops;
class AA{
	void m1() {
		System.out.println("m1 method");
	}
	
}
class BB extends AA{
	void m2() {
		System.out.println("m2 method");
	}
	
}
class CC extends BB{
	void m3() {
		System.out.println("m3 method");
	}
	
}
//Multi-level inheritance
public class eg2 {
	public static void main(String[] args) {
		CC c=new CC();
		c.m1();
		c.m2();
		c.m3();
	}

}
