//throw keyword we can create custom errors
//throws keyword applied on the  methods levels--ioException,sqlexception,exception



public class eg5 {
	public static void main(String[] args) throws Exception {
		getLogin("nitish", "xnsxitish");
	}
	public static void getLogin(String UserName,String password) throws Exception {
		if((UserName =="nitish")&&(password =="password")) {
			System.out.println(UserName);
			System.out.println(password);
		}else {
			throw new Exception("USERNAME&PASSWORD IS INVAILD ");
		}
	}
	

}
