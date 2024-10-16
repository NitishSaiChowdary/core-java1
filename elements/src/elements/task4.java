package elements;

import java.util.InputMismatchException;
import java.util.Scanner;

public class task4 {
	public static void main(String[]args) {
		Scanner sc =null;
		try {
			System.out.println("enter your data to check the power bill:");
			sc = new Scanner(System.in);
			double bill = sc.nextDouble();
			if(bill==240) {
				System.out.println("your powerbill is on jan");
			}else if (bill == 220) {
				System.out.println("your powerbill is on feb");
			}else if (bill == 260) {
				System.out.println("your powerbill is on march");
			}else if (bill == 280) {
				System.out.println("your powerbill is on april");
			}else if (bill == 500) {
				System.out.println("your powerbill is in may");
			}else if (bill == 600) {
				System.out.println("your powerbill is on june");
			}else {
				System.out.println("your powerbill is on july");
			}}catch(InputMismatchException e) {
				System.out.println(e);
			}finally {
				sc.close();
			}
		}
	}


