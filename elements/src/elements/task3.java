package elements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task3 {
	public static void main(String[]args) throws IOException {
		BufferedReader reader = 
				  new BufferedReader(new InputStreamReader(System.in));
		double salary = 0;
		System.out.println("enter your salary");
		String input = reader.readLine();
		salary = Double.parseDouble(input);//it will convert into the double
		
				if(salary==10000) {
					System.out.println("your salary is 10000");
				}else if (salary == 20000) {
					System.out.println("your salary is 20000");
				}else if (salary == 30000) {
					System.out.println("your salary is 30000");
				}else if (salary == 40000) {
					System.out.println("your salary is 40000");
				}else if (salary == 50000) {
					System.out.println("your salary is 50000");
				}else if (salary == 60000) {
					System.out.println("your salary is 60000");
				}else {
					System.out.println("your salary is 70000 ");
				}
				reader.close();
	}

}
