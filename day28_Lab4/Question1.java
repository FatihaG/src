package day28_Lab4;

public class Question1 {

	public static void main(String[] args) {
		
		int []x= {1,2,6};
		
		int[]y= {6,1,2,3};
		
		int[] z= {13,6,1,2,3};
		
		int[] k= {2};
		
		System.out.println(arr(x));
		System.out.println(arr(y));
		System.out.println(arr(z));
		System.out.println(arr(k));
	}

	
	
	public static  boolean arr (int [] num) {
		
		if(num.length<1) {
			return false;
		}

		if (num [0]==6 || num [num.length-1]==6) {
			
			return true;
		}else {
			return false;
		}
		
		
		
		
	}
}
