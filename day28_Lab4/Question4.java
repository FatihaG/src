package day28_Lab4;

public class Question4 {

	public static void main(String[] args) {
		int[]x= {1,2,3};
		int[]y= {5,11,2};
		int []z= {7,0,0};
		int []a= {3,-2,10,4};
		
		System.out.println(numbers(x));
		System.out.println(numbers(y));
		System.out.println(numbers(z));
		System.out.println(numbers(a));
		
	}

	
	public static int numbers (int []num) {
		
		int sum=0;
		
		for(int i: num) {
			sum=sum+i;
			
		}
		return sum;
		
	}
	
	
}
