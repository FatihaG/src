package day29_Lab4;

public class Question22 {

	public static void main(String[] args) {
      
		int []x= {1,4,1};
		int []y= {1,4,1,4};
		int []z= {1,1};
		
		System.out.println(number(x));
		System.out.println(number(y));
		System.out.println(number(z));
	}

	
	public static boolean number(int [] arr) {
		
		int one=0;
		int four=0;
		
		for (int i=0;i<arr.length;i++) {
			if (arr[i]==1) {
				one++;
			}
			if(arr[i]==4) {
				four++;
			}
		}
		if (one>four) {
			return true;
		}else {
			return false;
		}
	}
	
}
