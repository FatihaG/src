package day5_unary_assignment_relation;

public class mixedInteger {

	public static void main(String[] args) {
		int i1=5;
		int i2=10;
		float f1=15.5f;
		double d1=20.5;
		
		int res1= i1=i2;
		float res2= i1+f1;
		double res3 =i2+d1;
		
		short firstNumber=10;
		short secondNumber=20;
		int thirdNumber= firstNumber+secondNumber;
		//short olanlar int kabul ediliyor gecici olarak o yuzdenint+int
		
		short thirdNumber2= (short) (firstNumber+secondNumber);
		
		byte b1=126;
		byte b2=1;
		byte b3= (byte) (b1*b2);
		// b1,b2 int olarak algiliyor
		
		int b4=126;
		int b5=1;
		  byte res=(byte)(b4+b5);//casting is required
		  byte res4=126+1; // no casting is required because 127 in the limit 
		

	}

}
