package week1.day2;

public class Factorial {

	public static void main(String[] args) {
		int input=5;
		int fact=1;
		for(int i=input;i>=1;i--) {
			fact=fact*i;
		}
		System.out.println("Factorial of 5 is " + fact);
	}

}
