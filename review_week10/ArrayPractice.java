package review_week10;

public class ArrayPractice {

	public static void main(String[] args) {

		int[] arr= {1,2,3,4,5,6,7,8,9,10,1,1,2,2,3,3,4,5,6,7,8,12};
		int countEven=0;
		int countOdd=0;
		
		
		for(int i=0;i<arr.length;i++) {
			if (arr[i]%2==0) {
				countEven++;
				continue;    //else de yapabilirsin burda
			}
				countOdd++;
			
		}
		System.out.println("Even numbers:"+countEven);
		System.out.println("Odd numbers: "+countOdd);
		
	}

}
