package day28_Lab4;

import java.util.Arrays;

public class Question11 {

	public static void main(String[] args) {
		int[]x= {1,2,3};
		int[]y= {2,3,5};
		int[]z= {1,2,1};
		int[]a= {11,2,13,3,2};
		
		System.out.println(Arrays.toString(set(x)));
		System.out.println(Arrays.toString(set(y)));
		System.out.println(Arrays.toString(set(z)));
		System.out.println(Arrays.toString(set(a)));
		
	}
	public static int[] set(int[] num) {
		
		for (int i=0;i<num.length-1;i++) {
			
			if (num[i]==2 && num[i+1]==3) {
				num[i+1]=0;
			}
			
		}
		return num;
	}
	
	
	
	
	
}
