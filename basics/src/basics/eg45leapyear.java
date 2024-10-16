package basics;

import java.util.Scanner;

public class eg45leapyear {
	public static void main(String[] args) {
		Scanner sc =null;
		
		try {
			System.out.println("Enter the year:");
			sc = new Scanner(System.in);
			int year =sc.nextInt();
		    if(((year % 4 ==0) && (year % 100 !=0)) || (year % 400==0)){  
		        System.out.println("LEAP YEAR");  
		    }  
		    else{  
		        System.out.println("COMMON YEAR");  
		    }  		
		} catch (Exception e) {
			System.out.println(e);
		}sc.close();
	}

}
