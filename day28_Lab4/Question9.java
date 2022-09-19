package day28_Lab4;

import java.util.Arrays;

public class Question9 {

	public static void main(String[] args) {

		int[]x= {4,5,6};
		System.out.println(Arrays.toString(abc(x)));
		
		
		
	}

	
	
	public static int[] abc (int[]arr) {
		
		int [] arr1=new int [(arr.length)*2];
		
		arr1[arr1.length-1]=arr[arr.length-1];
		
		return arr1;
	}
	
	
}
