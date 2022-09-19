package day_34_constructor_passingObjectToMethod;

public class CalculateCarpet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Floor A=new Floor(10,12);
		Carpet A1=new Carpet(8);
		Calculator aa=new Calculator(A,A1);
		
		
         	
	 
	 System.out.println(aa.getTotalCost());
	}

}
