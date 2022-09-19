package review_week8;

import java.util.Arrays;

public class AvarageFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //Create a method that will accept an int array and return the average of the elements
			//	    Ex: [10, 15, 5, 6] -> 9

		int[]arr= {10,15,5,6,13,-10,-3};
		System.out.println(getAvarage(arr));
		
		
	}

	public static int getAvarage(int []arr) {
		int sum=0;
		for (int  num:arr) {
			
			sum+=num;
		}
		
		return sum/arr.length;
	}
	
	
	public static double getAverage(double [] arr) {
		double sum = 0;
		
		for(double num : arr) {
			sum += num;  // sum = sum + num
		}
		
		return sum / arr.length;
	}
	
	
	
	
	
}
