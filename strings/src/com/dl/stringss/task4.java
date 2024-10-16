package com.dl.stringss;

public class task4 {
	public static void main(String[] args) {
		//8.How to convert byte data to String data 
		//To convert Byte data to String Data we use String Constructor 
		byte b1[] = {65,66,67,68,69,70,71};
		//The constructor String(byte) is undefined
		String s1 = new String(b1);
		System.out.println(s1);//ABCDEFG
		
		//9.How to convert char data to String data 
		char ch1[]= {'n','i','t','i','s','h'};
		System.out.println(ch1);
		
		String s2 = new String(ch1);
		System.out.println(s2);
	}

}
