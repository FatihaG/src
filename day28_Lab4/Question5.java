package day28_Lab4;

import java.util.Arrays;

public class Question5 {

	public static void main(String[] args) {

		int[]x= {1,2,3};
		int[]y= {17,12,10,8};
		int[]z= {7,0,0};
		
		System.out.println(Arrays.toString(rotated(x)));
		System.out.println(Arrays.toString(rotated(y)));
		System.out.println(Arrays.toString(rotated(z)));
		
	}

	public static int[] rotated(int [] nums) {
		
		int x=nums[0];
		
		for (int i=0;i<nums.length-1;i++) {
			
			 nums[i]=nums[i+1];
		}
		
		nums[nums.length-1]=x;
		
		return nums;
		
	
	}
	
	
	
	
}
