package day29_Lab4;

public class Question16 {

	public static void main(String[] args) {

		int []x= {2,1,2,3,4};
		int[]y= {2,2,0};
		int[]z= {1,3,5};
		
		number(x);
		number(y);
		number(z);
		
	}

	
	public static void number(int [] arr) {
		
		int even=0;
		
		for(int abc:arr) {
			if (abc%2==0) {
				even++;
			}
		}
		System.out.println(even);
		
	}
	
	
}
