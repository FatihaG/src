package reviewWeek5;

public class UsingTheReturnKeywordToControlMethodExecution {

	public static void main(String[] args) {
		/**
		
		
		*/
      //voter can vote if they are more than 18 else they can't		
		printVotingEligibility(19);
		printVotingEligibility(-1);
		printVotingEligibility(200);
		
	}

	public static void printVotingEligibility(int age) {
		
		//if the age is less than 0 or more than 100 
		//print invalid number and exit out of the method
		
		if (age<0 || age>100) {
			System.out.println("invalid number");
			return ; //exit from the method
		}
		
		
		
		if (age>18) {
			System.out.println("you are eligible to vote");
		}else {
			System.out.println("you are not eligible");
		}
		System.out.println("this is end of the message");
	}
	
	
	
	
}
