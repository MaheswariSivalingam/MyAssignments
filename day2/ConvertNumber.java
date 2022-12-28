package week1.day2;

public class ConvertNumber {

	public static void main(String[] args) {
	     int number = -40;
	     if(number<0) {
	    	 System.out.println(number+" is a negative number");
	    	 int positive=number * -1;
	         System.out.println("converting negative number "+number+" to a postive number: "+positive);
	     }
	     else
	     {
	    	 System.out.println(number+" is a positive number");
	     }
	    
	}

}
