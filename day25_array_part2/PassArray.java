package day25_array_part2;

import java.util.Scanner;

public class PassArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] numbers=new int [4];
		 // pass the array to thegetValues method
		
		getValues(numbers);
		
		System.out.println("here are the numbers that you entered");
		
		//pass the array to show array method
		showArray(numbers);
		
	}

	public static void getValues(int[] array ) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a series of "+ array.length+ "numbers");
	
		for(int i=0;i<array.length;i++) {
			System.out.println("enter number "+ (i+1)+" : ");
		
		array[i]=sc.nextInt();
		}
	
	}
	
	public static void showArray(int[] arr) {
		
		for (int value:arr) {
			System.out.println(value);
		}
	}
	
	
}
