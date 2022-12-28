package week1.day2;

import java.util.Arrays;

public class SecondSmallestNumber {

	public static void main(String[] args) {
		int[] arr= {23,45,67,32,89,22};
		Arrays.sort(arr);
		for(int i=0;i<=arr.length-1;i++) {
		System.out.println(arr[i]);
		}
        System.out.println(arr[1]+"  is the second smallest number");
	}

}
