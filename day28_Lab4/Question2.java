package day28_Lab4;

import java.util.Arrays;

public class Question2 {

	public static void main(String[] args) {

		
		int []x= {1,2,3};
		int []y= {1,2,3,1};
		int []z= {1,2,1};
		int []k= {1};
		
		System.out.println(equal(x));
		System.out.println(equal(y));
		System.out.println(equal(z));
		System.out.println(equal(k));
		
		
		
	}
	
	
	public static String equal (int [] arr) {
		
		if (!(arr.length>1)) {
			return "not valid an array";
			
		}
		
		if (arr[0]==arr[arr.length-1]) {
			return "true";
		}else {
			return "false";
		}
		
		
	}

}
