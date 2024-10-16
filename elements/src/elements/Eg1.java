package elements;

public class Eg1 {
	public static void main(String[] args) {
		
		System.out.println(new Eg1().addbyte());
	    System.out.println(new Eg1().s());
		System.out.println(new Eg1().l());
		System.out.println(new Eg1().f());
		System.out.println(new Eg1().d());
		System.out.println(new Eg1().addchar());
		System.out.println(new Eg1().addbool());
		Eg1 eg2 = new Eg1();
		System.out.println(eg2.add());
	}
	public int add() {
		int a=20;
		int b=30;
		return a+b;
	}
	public byte addbyte() {
		byte a=20;
		byte b=30;
		return(byte) (a+b);
	}
	public short s() {
		short x=20;
		short y=30;
		return (short)( x*y);
	}
	public long l() {
		long z=20000;
		long w=10000;
		return z/w ;
	}
	public float f() {
		float s=220.4f;
		float d=10.2f;
		return s*d;
	}
	public double d() {
		double a =220.4555d;
		double d=10.2333d;
		return a+d;
	}
	public char addchar() {
		char ch1='a';
		return (char)(ch1);
	}
	public boolean addbool() {
		boolean ch1=true;
		return (boolean) (ch1);
	}
}
