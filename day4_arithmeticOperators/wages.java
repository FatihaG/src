package day4_arithmeticOperators;


// this program calculates hourly wages plus overtime
public class wages {

	public static void main(String[] args) {
		
		double regularWage; //the calculated regular wage
		double basePay =25;//the base pay
		double regularHours=40;//the hours worked less overtime
		double overtimeWages; //overtime wages
		double overTimePay=37.5; //overtime pay rate
		double overTimeHour=10;
		double totalWage; //total wage
		
		regularWage=basePay*regularHours;
		overtimeWages=overTimeHour*overTimePay;
		totalWage=regularWage+overtimeWages;
		
		System.out.println("wages for this week is $ "+ totalWage);

		System.out.println();
	}

}
