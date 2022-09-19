package day15;

public class fibonacci {

	public static void main(String[] args) {
		
		
		int count=12;
		int pre1=0;
		int pre2=1;
		
		System.out.println("fibonacci series of "+count+ "numbers");
		
		for (int i=1;i<=count;i++) {
			
			System.out.print(pre2+" ");
			
			int sumOfPrevNum= pre1+pre2;
			pre1=pre2;
			pre2=sumOfPrevNum;
			
			
		}
		
		
		
		

	}

	
		
	}


