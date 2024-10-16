package basics;

import java.util.Scanner;

public class eefff {

    public static void main(String[] args) throws Exception {
        System.out.println("Enter your UserName:");
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        String userName = sc.nextLine(); 
        
        System.out.println("Enter your password:");
        String password =sc.nextLine();
        
        System.out.println("Enter your DOB:");
        int DOB =sc.nextInt();

        // Use .equals() for string comparison
        if (userName.equals("nitish") && password.equals("password")&&(DOB==2003)) {
            System.out.println("THANKYOU FOR LOGIN ,HAVE GREAT DAY");
            
        }
        else {
            throw new Exception("USERNAME & PASSWORD IS INVALID");
        }
    }
}
