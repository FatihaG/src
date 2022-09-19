package day29_Lab4;

public class Question21 {

	public static void main(String[] args) {

		int []x= {2,3,2,2,4,2};
		int[]y= {2,3,2,2,4,2,2};
		int[]z= {1,2,3,4};
		 
		numbers(x);
		numbers(y);
		numbers(z);
		
		
	}
     public static void numbers (int[] arr) {
    	 
    	 int sum=0;
    	 for (int i=0;i<arr.length;i++) {
    		 if (arr[i]==2) {
    			 sum=sum+2;
    		 }
    	 }
    	 if(sum==8) {
    		 System.out.println(true);
    	 }else {
    		 System.out.println(false);
    	 }
     }
}
