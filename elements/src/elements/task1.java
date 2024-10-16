package elements;

import java.util.Scanner;

public class task1 {
	public static void main(String[]args) {
		//by using the Scanner
		System.out.println("enter the salary:");
		Scanner sc =new Scanner(System.in);
				double salary = sc.nextDouble();
				if(salary==10000) {
					System.out.println("your salary is 10000");
				}else if (salary == 20000) {
					System.out.println("your salary is 20000");
				}else if (salary == 20000) {
					System.out.println("your salary is 30000");
				}else if (salary == 20000) {
					System.out.println("your salary is 40000");
				}else if (salary == 20000) {
					System.out.println("your salary is 50000");
				}else if (salary == 20000) {
					System.out.println("your salary is 60000");
				}else {
					System.out.println("your salary is 70000 ");
				}
				sc.close();
				
	}

}
