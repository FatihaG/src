package day29_Lab4;

import java.util.Arrays;

public class Question29 {

	public static void main(String[] args) {

	int[]x= {2,10,3,4,20,5,100,3,4};
	int[]y= {10,1,20,2};
	
	System.out.println(Arrays.toString(tenRun(x)));
	System.out.println(Arrays.toString(tenRun(y)));
		
	}
		
		public static int [] tenRun(int [] num) {
			
			boolean mul=false;
			
			for (int i=0;i<num.length;i++) {
				
				
				if (num[i]%10==0) {
					for(int j=i+1;j<num.length && num[j]%10 !=0;j++) {
				
					num[j]=num[i];
					}
				}
			}
			
			return num;
			
			
		}
	
	
	
}
