package week1.day1;

public class Mobile {
	
	public void makeCall() {
		String mobileModel="samsung galaxy m31";
		float mobileWeight=191.00f;
		System.out.println("mobile Model is "+mobileModel+"\n"+"mobile Weight is "+mobileWeight);
	}
	
	public void sendMsg() {
		boolean isFullyCharged=true;
		int mobileCost=13000;
		System.out.println("mobile is fullycharged = "+isFullyCharged+"\n"+"cost is "+mobileCost);
	}
	public static void main(String[] args) {
		Mobile obj=new Mobile();
		obj.makeCall ();
		obj.sendMsg() ;
		System.out.println("This is my mobile");
	}
	
}