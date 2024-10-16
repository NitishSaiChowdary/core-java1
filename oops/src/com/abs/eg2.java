package com.abs;
//methods,blocks
abstract class AA{
	{
		System.out.println("insta block");
	}
	static {
		System.out.println("static block");
	}
}
class BB extends AA{
	
}



public class eg2 {
	public static void main(String[] args) {
		new BB();
		
	}

}
