import java.util.ArrayList;
import java.util.Iterator;


public class Hello {
    
    public static void main(String[] args) {
       /*  System.out.println("Helloword");
        System.out.println("I am learning java");
        System.out.println("it is good");
        System.out.print("Hello World! ");
        System.out.println("I will print on the same line.");
        System.out.println(345757);
        System.out.println(3+3+3);
        System.out.println(3*2);
        System.out.println(3/3);
        System.out.println(3-3);
        int aaaa = 0xfe23;
        System.out.println(aaaa);
        String name ="nitishsaichowdary";
        System.out.println("hello  "   +name);
        // in this two one we can declare the variable with assin the value andwithout assin the value and assign the value later
        int a = 12345;
        System.err.println(a);
        String fristName = "Nitishsai";
        String lastName = "chowdary";
        String Fullname = fristName+lastName;
        System.out.println(Fullname);
        int x=56 ,y=45 ,z=55;
        System.out.println(x+y+z);


        //One Value to Multiple Variables
        int f, b , c;
        f=b=c=45;
        System.out.println(f+b+c);


        // Student data
        String studentName = "John Doe";
        int studentID = 15;
        int studentAge = 23;
        float studentFee = 75.25f;
        char studentGrade = 'B';

        // Print variables
        System.out.println("Student name: " + studentName);
        System.out.println("Student id: " + studentID);
        System.out.println("Student age: " + studentAge);
        System.out.println("Student fee: " + studentFee);
        System.out.println("Student grade: " + studentGrade);

        //write the program for area of rectangle- 
        int length = 10;
        int width = 30;
        int area;
        area = length * width;
        System.out.println("length=" +length);
        System.out.println("Width=" +width);
        System.out.println("Area of Rectangle=" +area);
        //write the program for area of circle
        double radius = 4.5d;
        double areas;
        areas=3.14*radius*radius;
        System.out.println("area of cricle=" +areas); 
        //data types there two types of data type they are-
        //Primitive Data Types and non-Primitive Data Types
        //Primitive Data Types they are -----
        //Integer Types
        //1.byte - -128 to 127 range 
        byte b1=10;
        System.out.println(b1);
        //2.short  -32768 to 32767 range
        short c1= 5000;
        System.out.println(c1);
        //3.int -2147483648 to 2147483647 range 
        int f1=2345566;
        System.out.println(f1);
        //4.long -9223372036854775808 to 922337203685477580 range
        long r1=515000000000L;
        System.out.println(r1);
        //Floating Point are two Types
        //1.float and 2.Double 
        //1.float -in float we use one or two decimal numbers 
        float g1=2.56f;
        System.out.println(g1);
        //2.Double - in double we use large number after decimal 
        Double d1=234.56778d;
        System.out.println(d1);
        //boolean - the are 1 dyte ture or flase--
        boolean bo1=true;
        System.out.println(bo1);
        //Characters-- they are two 
        //1.char and 2.string
        //1.char - they are single character 
        char ch1='a';
        System.out.println(ch1);
        //2.string

        ///Java Type Casting
        //there are two types of casting 1.widening casting-there are automatically converting to small to large ex
        int m= 9;
        double n = m;
        System.out.println(m);
        System.out.println(n);
        //2.narrowing casting -there manually converting a larger to small
        double q =9.78d;
        int e =(int)q;
        System.out.println(q);
        System.out.println(e);
        //Java Operators
        int maxScore = 500;
        int userScore = 423;
        float percentage = (float) userScore / maxScore * 100.0f;
        System.out.println("your percentage is "+percentage);
        //Java Operators java divides the operators into the following groups;
        //1.Arithmetic OPerators
        //+,-,*,/,%,++,--
        //2.Assignment operators
        //=,<,>,!=,
        //Java Strings
        String greeting = "hello";
        System.err.println( greeting+" hi this sai  ");
        //string length----length()
        String txt ="AcfBCDEFGDHIJ";
        System.out.println("the length of the txt is " +txt.length());
        //more string methods---
        String txt1 = "hello world";
        String txt2 = "HELLO WORLD";
        System.out.println("this is uppercase example "+txt1.toUpperCase());
        System.out.println("this is LOWERcase example  "+txt2.toLowerCase());
        //indexOf()----the method returns the index of the first occurrence of partcaluer text in the givin string
        System.out.println(txt.indexOf('D'));
        //You can also use the concat() method to concatenate two strings:
        String firstName ="Nitishsai";
        String last_Name ="chowdary";
        System.out.println(firstName.concat( last_Name));
        String txt3 = "We are the so-called \"Vikings\" from the north.";
        System.out.println(txt3);
        //Java Math
        //math.max(x,y)
        System.out.println(Math.random());
        int randomNum = (int)(Math.random() * 201);  // 0 to 200
        System.out.println(randomNum);*/
        ArrayList<String> list = new ArrayList<>();
        list.add("NameOne");
		list.add("NameTwo");
		list.add("NameThree");
		list.add("NameFour");
		list.add("NameFive");
        list.add("sixthName");
        System.out.println(list); // [NameOne, NameTwo, NameThree, NameFour, NameFive]
        Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			
			System.out.println(iterator.next());
		}
		



















    }
    
    }
