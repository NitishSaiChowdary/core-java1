//exception handling

//what is exception ?
//A unwatend exception that disturibs the normal flow of program is called exception handling 

//what are the type of keywords we use in exception handling?
//try-catch,finally,throw,throws

//can you draw the hierarchy of excepption handling?
//Objects -- Throwble -- Exception -- Error --
//exception--Rintime --Ioexception -- sqlexception
//error -- 

//What are the type of Exceptions 
//Compile Time Exception(checked exception) and Run Time Exception(unchecked exception)

//What is Throwable
//Throwable is the parent class for all the exceptions

//Difference b/w Exception and Error
//Error are occurred due to lack of system resources
//A unwatend exception that disturibs the normal flow of program is called exception

//Different b/w partially checked and fully checked exception ?
//A checked exception is said to be partially checked if and it has both checked and unchecked child class
//partially checked exception are throwble and exception 

//what is fully checked exception?
//A checked exception is said to be full checked exception if and only its all the child class also checked 
//eg:Io Exception ,SQL Exception 

//How to aviod finally block 
//yes ,write system.exit(0)
public class eg1 {
	public static void main(String[] args) {
		
	//task1
		//only try was executad 
		try{
			int list[]= {122,33,444,55,666,777};
			System.out.println(list[3]);	
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
	    }
		
		
		//task2
		//try and finally exectued 
		try {
			System.out.println("try block");
			
		} finally {
			System.out.println("finally block");
		}
	
		//task3
		//how to avoid finally to exectued  
		try {
			System.out.println("earth and jupiter");
			
		} finally {
			System.exit(0);
			System.out.println("moon and sun");
			
		}
		
		//task5
		for (int i = 0; i < 10; i++) {
			try {
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		
		//do java support method inside method?	
	    //No, Java does not support "directly" nested methods
		//Are inner classes supported in Java?
		//Java inner class or nested class is a class that is declared inside the class or interface
		//task 6:
		try {
			try {
				
			}catch (Exception e) {
				
			}
			
		} catch (Exception e) {
			
		}
	
   }
}
		
