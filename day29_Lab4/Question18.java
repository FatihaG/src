package day29_Lab4;

public class Question18 {

	public static void main(String[] args) {

		int[]x= {1,2,2,1};
		int[]y= {1,1};
		int[]a= {1,2,2,1,13,700};
		int[]b= {1,2,2,1,13,3};
		
		number(x);
		number(y);
		number(a);
		number(b);
		
	}

	public static void number(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
		if(arr[i]==13) {
			break;
		}else {
			sum=sum+arr[i];
		}
		}
		System.out.println(sum);
	}
	
}
