package day29_Lab4;

public class Question19$$ {

	public static void main(String[] args) {
     
		int[]x= {1,2,2};
		int[]y= {1,2,2,6,99,99,7};
		int[]z= {1,1,6,7,2};
		int[]a= {1,1,6,2};
		int[]b= {1,2,2,6,99,99,7,3,4};
		
		numbers(x);
		numbers(y);
		numbers(z);
		numbers(a);
		numbers(b);

	}

	
	  public static void numbers(int [] arr) {
		  
		  int sum=0;
		  
		  boolean checkSix=false;
		  
		  for (int i=0;i<arr.length;i++) {
			  if (checkSix) {
				  if (arr[i]==7) {
					  checkSix=false;
				  }
				  
			  }else if (arr[i]==6) {
				  checkSix=true;
			  }else {
				  sum=sum+arr[i];
			  }
		  }
		  System.out.println(sum);
	  }
}
