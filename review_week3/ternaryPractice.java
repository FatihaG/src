package review_week3;

public class ternaryPractice {

	public static void main(String[] args) {
		//ternary operator like syntatic sugar:)
		//anything ternary operator can do,if else statement can do it!
		//the only time you can use ternary op.:when you want to assingn variable value according to certain condition!
		
		//String amOrPm="";
		//int hour =11;
		
		/*if(hour>12) {
			amOrPm= "PM";
		}else {
			amOrPm="AM";
		}
		System.out.println("it is "+amOrPm);
		*/
		
		//syntax for ternary
		//datatype variableName=(condition) ? iftrueassignthis:ifFalseAssignThis
		 //String    amOrPm =(hour>12 && hour>24)   ? "PM"      : "AM";
		
		//System.out.println("it is "+amOrPm);
		
		int num1=10;
		int num2=20;
		
		int biggerNumber;
		
		/*if (num1>num2) {
			biggerNumber=num1;
		}else  {
			biggerNumber=num2;
		}
		*/
		
		biggerNumber= (num1>num2)?num1:num2;
		System.out.println(biggerNumber);
	}

}
