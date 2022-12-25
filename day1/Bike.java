package week1.day1;

public class Bike {
	public  void applyBreak() {
		System.out.println("Applied break");
	}
	
	public  void soundHorn() {
		System.out.println("sound horn");
	}
	public static void main(String[] args) {
			Car obj2=new Car();
	        obj2.applyBreak();
	        obj2.soundHorn();
	        Bike obj3=new Bike();
            obj3.applyBreak();
            obj3.soundHorn();
	}
}
