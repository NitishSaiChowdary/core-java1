package com.enums;

enum Books {
	JAVA , PYTHON ,SQL ,C
}

public class eg2 {
	public static void main(String[] args) {
		try {
			Books b= Books.valueOf("JAVA");
			System.out.println(b);
		}catch(IllegalArgumentException e ) {
			System.out.println("no enum constants ");	
		}
		//this values method will return the arrays of elements 
		Books[] values = Books.values();
		for (Books books : values) {
			System.out.println(books + " index is " +books.ordinal());
			
		}
		 
	}

}
