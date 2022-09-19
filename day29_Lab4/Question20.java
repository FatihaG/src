package day29_Lab4;

public class Question20 {

	public static void main(String[] args) {

		int[]x= {1,2,2};
		int[]y= {1,2,1,2};
		int[]z= {2,1,2};
		int[]k= {2,2,1,2};
		
		number(x);
		number(y);
		number(z);
		number(k);
	}

	
	
	public static void number (int[] arr) {
		boolean flag=false;
		
		
		for (int i=0;i<arr.length-1;i++) {
			if (arr[i]==2 && arr[i+1]==2) {
				flag=true;
				break;
			}
			 }
		
		if (flag) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	
	}
}
