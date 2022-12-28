package week1.day2;

public class Palindrome {


		public static void main(String[] args) {
			int num = 34343 ;
			int temp,s,rem;
	        temp=num;
	        for(s=0;num>0;num/=10) 
					{
				 rem=num%10;
				    s=(s*10)+rem;
			        }
				if(s == temp) {
					System.out.print(temp + " is a palindrome number");
				}
				else
				{ 
					System.out.print(temp +" is not palindrome number");
				}
	                  
		}
	}


