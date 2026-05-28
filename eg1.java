public class eg1 {
    public static void main(String[] args) {

        eg1 Eg1=new eg1();
        Eg1.order();
        
    }
    public void cus(String cusName){
        System.out.println("Name:"+cusName);
    }
    public void product(String proudct) {
        System.out.println("Product:"+proudct);
    }
    public String coupon() {
		return "xyz";
	}
    public void order(){
        cus("Nitishsai");
        product("Apple");
        double price = 100000;
        System.out.println("Price:"+price);
        double discount;
        boolean hascoupon =coupon().equals("xyz");
        if (hascoupon){
            discount=0.1;
        }else{
            discount=0.0;
        }
        double finalprice = price -(price * discount);
		System.out.println("After applying discount the finalprice: "+finalprice);

        

    }
    
}
