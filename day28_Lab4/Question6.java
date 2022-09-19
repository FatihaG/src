package day28_Lab4;

import java.util.Arrays;

public class Question6 {

	public static void main(String[] args) {

		int[]x= {1,2,3};
		int[]y= {11,5,9};
		int[]a= {110,5,98,0,1200,11,-4};
		
		System.out.println(Arrays.toString(greatest(x)));
		System.out.println(Arrays.toString(greatest(y)));
		System.out.println(Arrays.toString(greatest(a)));
	}

	
	public static int[] greatest (int [] arr) {
		
		Arrays.sort(arr);
		
		 
		
		for (int i=0;i<arr.length;i++) {
			
			arr[i]=arr[arr.length-1];
		
		}
		return arr;	
		}
		
	
	
	
	
	
	
	
}
