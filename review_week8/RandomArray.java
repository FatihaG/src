package review_week8;


import java.util.Random;

import java.util.Arrays;

public class RandomArray {

	public static void main(String[] args) {
		// Create a method that will accept a number and returns an int array.
		//The size of the array will be based on the given number. 
		//Fill each element with a random number (range: 1-100). Print the array

		System.out.println(Arrays.toString(generateRandomArray(10)));
		
		
		
	}

	public static int [] generateRandomArray(int size) {
		
		Random num=new Random();
		
		int[] arr=new int[size];
		
		for(int i=0;i<size;i++) {
			
			arr[i]=num.nextInt(100)+1;
		}
		
		return arr;
	}
	
	
}
