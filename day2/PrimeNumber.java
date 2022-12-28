package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		int num=13;
		boolean flag = false;
		int m = num/2;
        for(int i=2;i<=m;i++) {
        	if(num % i==0) {
        		System.out.println(num+" is not primenumber");
        		flag= true;
        		break;
        	}
        }
        if(flag==false) {
        	System.out.println(num+" is primenumber");
        }
	}

}
