package review_week8;

public class UniquefromArray {

	public static void main(String[] args) {
// create a method and find the unique values
		
		int [] arr = {1,2,3,1,2,4,8,8,8,9,9,7,6,6};
		uniquesValues(arr);
		
		
	}

	
	public static void uniquesValues (int [] nums) {
		
		for (int eachNum : nums) {
			
			int count = 0;
			
			for (int eachInnerNum : nums) {
				if (eachNum==eachInnerNum) {
					count++;
				}
			}
			
			if (count==1) {
				System.out.println(eachNum);
			}
		}
		
		
	}
	
	
}
