package day15;

public class task71 {

	public static void main(String[] args) {
		
		calcFeetAndInchesToCentimeters(100);
		calcFeetAndInchesToCentimeters(6, 0);
	}

	public static double calcFeetAndInchesToCentimeters(double feet,double inches) {
		
		if (feet<0||(inches<0||inches>12)) {
			System.out.println("invalid feet or inches");
			return -1;
		}
		double centimeters=(inches*2.54)+(feet*12*2.54);
		System.out.println(feet + " feet, "+ inches+ " inches= "+ centimeters+ " centimeters");
		return centimeters;
	}
	
	public static double calcFeetAndInchesToCentimeters(double inches ) {
		
		if (inches<0) {
			return -1;
		}
		double feet =(int)inches/12;
		double remeiningInches=inches%12;
		 System.out.println(inches+ " inches= "+feet+" feet and "+ remeiningInches+ " inches");
		 return calcFeetAndInchesToCentimeters(feet,remeiningInches);
	}
	
}
