package com.thiskeyword;

public class profile {
	int userId;
	String userName;
	String userEmail;
	String adders;
	int pincode;
	
	//1.this keyword to refer current class instance variable 
	
//	public profile(int userId, String userName, String userEmail, String adders, int pincode) {
//		this.userId = userId;
//		this.userName = userName;
//		this.userEmail = userEmail;
//		this.adders = adders;
//		this.pincode = pincode;
//}
	
	
//	public profile(int userId, String userName, String userEmail, String adders, int pincode) {
//		userId = userId;
//		userName = userName;
//		userEmail = userEmail;
//		adders = adders;
//		pincode = pincode;
//	}
	public profile(int uId, String uName, String uEmail, String add, int pin) {
		userId = uId;
		userName = uName;
		userEmail = uEmail;
		adders = add;
		pincode = pin;
	}
	
	
	public void display() {
		System.out.println(userId);
		System.out.println(userName);
		System.out.println(userEmail);
		System.out.println(adders);
		System.out.println(pincode);
		
	}
	
	public static void main(String[] args) {
		profile p = new profile (101,"Nitishsai","sai2003@gmail.com","hyb",500081);
		p.display();
	}
	
	
	
	
	

}
