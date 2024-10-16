package elements;

public class eg2 {

	public static void main(String[] args) {
		eg2 Eg2 =new eg2();
		Eg2.order();
		

	}
	public void customer(String customerName) {
		System.out.println("customer name: "+customerName);
		
	}
	public void productName(String productName) {
		System.out.println("ProductName: "+productName);
	}

		public String coupon() {
		return "xyz";
	}
	public void order() {
		customer("Nitishsai");
		productName("Apple");
	    double price = 100000;
		System.out.println("Oringalprice: "+price);
		double discount;
		
		boolean hascoupon = coupon().equals("xyz");
		
		if(hascoupon) {
			discount =0.1;
			
		}else {
			discount =0.0;
		}
		//discount formulae
		double finalprice = price -(price * discount);
		System.out.println("After applying discount the finalprice: "+finalprice);
		
	}

}
