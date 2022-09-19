package day29_Lab4;

public class Question24 {

	public static void main(String[] args) {
		
		int[]x= {1,2,1,3};
		int a=2;
		
		int[]y= {1,2,1,3};
		int b=1;
		
		System.out.println(abc (x,a));
		System.out.println(abc (y,b));
		
	}
       public static boolean abc(int []arr, int num) {
    	   
    	   for (int i=0;i<arr.length-2;i++) {
    		   
    		   if (arr[i]==num && arr[i+1]==num || arr[i+2]==num) {
    			   return true;
    		   }   
    	   }
    	   
    		   return false;
    	   }
    	   
       
}
