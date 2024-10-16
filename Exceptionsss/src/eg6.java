//can we write Exception in finally block 
//yes , by using nested try-catch in finally block 
class JDBC{
	static {
		System.out.println("static block");
	}
}
public class eg6 {
	@SuppressWarnings("finally")
	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("JDBC");
		//////////////////////////////
		try {
			System.out.println("tryblock");
			 throw new RuntimeException("tryblock:RuntimeException");
		} catch (Exception e) {
			System.out.println("catchblock:" +e);
		}finally {
        ////System.exit(0);
			System.out.println("finallyblock");
			throw new RuntimeException("finallyblock:RuntimeException");
		}
	}
	

}
