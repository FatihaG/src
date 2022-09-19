package day28_Lab4;

import java.util.Arrays;

public class Question15 {

	public static void main(String[] args) {

		int[]x= {1,2,3,4};
		swap(x);
		int[]y= {1,2,3};
		swap(y);
		int[]z= {8,6,7,9,5};
		swap(z);
		
	}

	public static void swap (int[] num) {
		
		int a=num[0];
		int b=num[num.length-1];
		
		for(int i=0;i<num.length;i++) {
		   num[0]=b;
		   num[num.length-1]=a;
		}   
			
		System.out.println(Arrays.toString(num));
	}
}
