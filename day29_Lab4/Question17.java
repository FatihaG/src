package day29_Lab4;

public class Question17 {

	public static void main(String[] args) {

		int[]x= {10,3,5,6};
		int[]y= {7,2,10,9};
		int[]z= {2,10,7,2};
		
		number(x);
		number(y);
		number(z);
		
		
	}

	public static void number(int[] arr) {
		
		int max=0;
		
		
		for (int i=0;i<arr.length;i++) {
			if (arr[i]>max) {
				max=arr[i];
			}}	
			
			int min=max;
		for (int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println(max-min);
		
	}
}
