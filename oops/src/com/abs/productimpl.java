package com.abs;
abstract class product{
	static int productprice;
	static int Discount;
	
	public void getdiscount(int offer) {
		Discount=productprice-offer;
		System.out.println("Orignal product price is-"+productprice);
		System.out.println("Offer price is:"+offer);
		System.out.println("after applying the discount for a product-" +Discount);
		
		
	}
	public void productdetials(String username,String useremail,String productname,String moblino) {
		System.out.println("username-"+username);
		System.out.println("useremail-"+useremail);
		System.out.println("productname-"+productname);
		System.out.println("moblino-"+moblino);	
	}
}
public class productimpl extends product {
	public static void main(String[] args) {
		productimpl p = new productimpl();
		p.productdetials("Nitishsai", "sai@gmail.com", "Apple","6303324745");
		product.productprice=120000;
		p.getdiscount(20000);
	    
		
	}

}
