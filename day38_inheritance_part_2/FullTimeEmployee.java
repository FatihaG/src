package day38_inheritance_part_2;

public class FullTimeEmployee extends Employee {
	
	public void calculatePay(int hours,double rate) {
		double total =(hours*rate)*1.05;
		System.out.println("fullTime Employee total pay:"+ (hours*rate)*1.05);
	}

}
