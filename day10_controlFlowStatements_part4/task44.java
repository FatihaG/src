package day10_controlFlowStatements_part4;

public class task44 {

	public static void main(String[] args) {
	
		System.out.println("KPH      MPH");
		
		for (int x=60;x<=130;x+=10){
			double mph= x*0.6214;
			System.out.println(x+"      "+ mph);
			
		}

	}

}
