package day28_Lab4;

import java.util.Arrays;

public class Question7 {

	public static void main(String[] args) {

		int []x= {1,2,3};
		int []y= {};
		int[]a= {7,4,6,2};
		int[]b= {};
		
		System.out.println(Arrays.toString(second(x, y)));
		System.out.println(Arrays.toString(second(a, b)));
		
	}

	
	public static int[] second (int[]a,int[]b) {
	
	      b=new int[2];
	
		b[0]=a[0];
	    b[1]=a[a.length-1];
	
	    return b;
	}
	
	
}
