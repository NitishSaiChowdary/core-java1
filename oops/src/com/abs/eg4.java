package com.abs;
// giving the one model to custm and remaining model hiding by the sellers 

abstract class cars{
	
	public abstract void f1();
	public abstract void m2();
	public abstract void m3();
	public abstract void m4();
}


abstract class base extends cars{
	public void f1() {
		System.out.println("base model");
	}
}
class top extends base{
    @Override
	public void m2() {
    	System.out.println("second model");
		
	}

	@Override
	public void m3() {
		System.out.println("three model");
		
	}

	@Override
	public void m4() {
		System.out.println("top model");
		
	}
	
}

public class eg4 {
   public static void main(String[] args) {
	   top c = new top();
	   c.f1();

	  
}
}
