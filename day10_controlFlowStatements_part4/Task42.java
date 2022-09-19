package day10_controlFlowStatements_part4;

public class Task42 {

	public static void main(String[] args) {
		
		int sumEven=0;
		int sumOdd=0;
		
		
		for (int i=1;i<100;i++) {
			if(i%2==0) {
				
				//System.out.print(i);
				sumEven=sumEven+i;
			}else {
				//System.out.print(i);
				sumOdd=sumOdd+i;
			}
			
		}

		System.out.println("sum of even number: "+ sumEven);
		System.out.println("sum of odd number: "+ sumOdd);
		
		
	}

}
