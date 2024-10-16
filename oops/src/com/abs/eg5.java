package com.abs;
class AAAAAA{
	
	public void add() {
		System.out.println("Add method");
	}
	
	public void put() {
		System.out.println("Put method");
	}
}


//Cannot instantiate the type abstract class BBBBBB
abstract class BBBBBB extends AAAAAA{
	
	
}

public class eg5 extends BBBBBB {
		public static void main(String[] args) {
//			BBBBBB b = new BBBBBB();//Cannot instantiate the type BBBBBB
			eg5 b = new eg5();
			b.add();
			b.put();
			

		}
	}

