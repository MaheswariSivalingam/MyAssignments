package week1.day1;

public class Calculator {

	public void sub() {
		int a=10;
		int b=5;
		System.out.println(a-b);
	}
	public int multiple(int a,int b) {
		return a*b;
	}
	
	public static void main(String[] args) {
		Calculator obj=new Calculator();
		obj.sub();
		System.out.println(obj.multiple(10, 3));

	}
}
