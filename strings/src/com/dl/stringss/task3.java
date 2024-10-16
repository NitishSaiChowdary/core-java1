package com.dl.stringss;
class product {
	//String literal
	String s2 ="Apple";

	public product(String s2) {
		this.s2 = s2;
	}
	
}
public class task3 {
	public static void main(String[] args) {
		//7.Different b/w String type and Object Type
		String s1=new String("Apple");
		System.out.println(s1);
		
		String pName ="samsung";
		pName="Apple";
		System.out.println(pName.equals(s1));//ture
		
		product p = new product("Apple");
		System.out.println(p.equals(pName));//false
//		System.out.println(p == pName);//incompatible operand types product and String
		
		System.out.println(s1.hashCode());
		System.out.println(pName.hashCode());
		System.out.println(p.hashCode());
		
		
	}

}
