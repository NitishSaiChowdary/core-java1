package com.thiskeyword;


//2.this keyword to invoke current class method

public class currentclasssmethod {
	public void add() {
		System.out.println("hello this addd method: "+(2+3));
		this.mul();
		this.put();
		this.sub();
		
	}
	public void mul() {
		System.out.println("hello this mul method: "+(2*3));
	}

	public void put() {
		System.out.println("hello this put method " +23);
		
	}
	public void sub() {
		System.out.println("hello this sub method: " +(2-3));
	}
	public static void main(String[] args) {
		new currentclasssmethod().add();
	}


}
