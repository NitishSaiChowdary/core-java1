
public class eg3 {
	public static void main(String[] args) {
        //task1:can we wite mulitply catch block
		//yes 
		try {
			int a[]= {10,20,30,40,50,60};
			System.out.println(a[3]);
			
			int b = 100;
			System.out.println(b);
			
			String s1 =" ";
			System.out.println(s1.length());
			
			String s11="Ten";
			int i = Integer.parseInt(s11);	
			System.out.println(i);
			
			String s12 ="java and python ";
			char CharAt=s12.charAt(16);
			System.out.println(CharAt);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);
		}catch (NumberFormatException e) {
			System.out.println(e);
		}catch (NullPointerException e) {
			System.out.println(e);
		}catch (ArithmeticException e) {
			System.out.println(e);
		}
//task2:
		
		try {
			int a[]= {10,20,30,40,50,60};
			System.out.println(a[3]);
			
			int b = 100;
			System.out.println(b);
			
			String s13 =" ";
			System.out.println(s13.length());
			
			String s113="Ten";
			int i = Integer.parseInt(s113);	
			System.out.println(i);
			
			String s123 ="java and python ";
			char CharAt=s123.charAt(16);
			System.out.println(CharAt);
			
		} catch (Exception e) {
			System.out.println(e);
		}
		//task3:insted mult catch block can we write in one catch block 
		//Yes 
		try {
			int a[]= {10,20,30,40,50,60};
			System.out.println(a[3]);
			
			int b = 100;
			System.out.println(b);
			
			String s13 =" ";
			System.out.println(s13.length());
			
			String s113="10";
			int i = Integer.parseInt(s113);	
			System.out.println(i);
			
			String s123 ="java and python ";
			char CharAt=s123.charAt(16);
			System.out.println(CharAt);
			
		} catch (NumberFormatException |StringIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}

}
