package day25_array_part2;

public class PassElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []numbers = {5,10,15,20,50,30};
		
		for(int value :numbers) {
			
			showValue (value);
		}
		}

	public static void showValue (int n) {
		System.out.print(n+" ");
	}
	
	
	
}
