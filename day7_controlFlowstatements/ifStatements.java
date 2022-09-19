package day7_controlFlowstatements;

public class ifStatements {
	
	public static void main (String [] args) {
		
		
		int score= 80;
		
		if (score>=70) {
			System.out.println("Excelent");
			System.out.println("You past with grade A");
		}
		
		
		int sales,bonus;
		double commisionRate,salary;
		
		sales=5200;
		salary=10000;
		
		if (sales>5000) {
		bonus=500;
		commisionRate=1.12;
		
		salary=salary*commisionRate+bonus;
	}
  
		System.out.println("salary= "+ salary);

		
		
		
		
		
}
}
