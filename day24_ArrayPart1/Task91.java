package day24_ArrayPart1;

import java.util.Random;

public class Task91 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rn=new Random();
		
		int [] nums=new int [10];
		
		for(int i=0;i<nums.length;i++) {
			
		
		nums[i]=rn.nextInt(100);
		
		System.out.print(nums[i]+" ,");
		}
	}

}
