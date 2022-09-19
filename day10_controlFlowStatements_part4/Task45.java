package day10_controlFlowStatements_part4;

public class Task45 {

	public static void main(String[] args) {
		
		int num1=5;
		int num2=10;
		int repeat=3;
		
		for (int i=1;i<=repeat;i++) {
			
			if (num1>num2) {
				System.out.println("num1 is greater than num2");	
			}else if (num2>num1) {
				System.out.println("num2 is greater than num1");
				
			}else if (num1==num2) {
				System.out.println("num1 is equal to num2");
				
			}
			
		}

	}

}
