package com.enums;
//Enums
//Enums are set of named constants
//Inside the enums all the variables are public static final by default
//Enums by default is a final class and it is super class to java.lang.Enum
	
//valueOf() method returns the enums constant along with the defined name	
//values() method can be used to return all the values present inside the enum
//ordinal() it can be used to return the position/ index of a constant in enum
enum days{
	MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
}
public class eg1 {
	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE + "-" +Integer.MIN_VALUE);
		System.out.println(days.MONDAY);
		System.out.println(days.TUESDAY);
		System.out.println(days.WEDNESDAY);
		System.out.println(days.THURSDAY);
		System.out.println(days.FRIDAY + "-Weekend started ");
		System.out.println(days.SATURDAY);
		System.out.println(days.SUNDAY);
		
	}

}
