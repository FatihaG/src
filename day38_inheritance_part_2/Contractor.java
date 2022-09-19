package day38_inheritance_part_2;

public class Contractor extends Employee{
	
	
	public void calculatePay(int hours,double rate) {
		
		System.out.println("Contractor pay :"+((hours*rate)+200));
	}

}
