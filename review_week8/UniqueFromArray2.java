package review_week8;

import java.util.Arrays;

public class UniqueFromArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,1,2,4,8,8,8,9,9,7,6,6};
		
		System.out.println(Arrays.toString(uniquesValues(arr)));
		
		
	}

	
	public static String [] uniquesValues (int [] nums) {
		
		String uniques="";
		
		for (int eachNum : nums) {
			
			int count = 0;
			
			for (int eachInnerNum : nums) {
				if (eachNum==eachInnerNum) {
					count++;
				}
			}
			
			if (count==1) {
				uniques+=eachNum + " ";
			}
		}
		System.out.println(uniques);
		return uniques.trim().split(" ");
	}
	}


