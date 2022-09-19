package review_week8;

import java.util.Arrays;

public class ArrayMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//- Create a method that will accept an int array
		//and return an int array of two elements. 
		//The two elements will be the min and max numbers from the array. 
			//    Ex: [31,4,1,-9, 300,3] -> [-9, 300]

		int [] arr= {31,4,1,-9, 300,3};
		
		System.out.println(Arrays.toString(getMinAndMax(arr)));
	}
	
	
	public static int [] getMinAndMax(int[] arr) {
		
		int[] result= {arr[0],arr[0]};
		
		for(int num:arr) {
			
			if (num<result[0]) {
			result[0]=num;
			}
			if(num>result[1]) {
				result[1]=num;
			}
		}
			return result; 
		}
	
	
	
	public static int [] getMinAndMax2 (int [] arr) {
		
		Arrays.sort(arr);
		
		int [] result = {arr[0], arr[arr.length-1]};
		return result;
		
		//return new int[] {arr[0], arr[arr.length-1]};

		//return new int[]{arr[1], arr[arr.length-2]};  --> 2nd min and max
		
	}

}
