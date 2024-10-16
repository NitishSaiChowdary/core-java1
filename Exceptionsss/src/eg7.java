//can we write return keyword in the try catch ;
//yes 
public class eg7 {
	public static void main(String[] args) {
		System.out.println(num(100, 100, 0));
	}

	public static int num(int a,int b,int c) {
		try {
			return (a+b)/c;
		} catch (Exception e) {
			return -22;
		}
	}
	
}
