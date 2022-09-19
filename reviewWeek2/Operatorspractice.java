package reviewWeek2;

public class Operatorspractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//naming:
		//class: start with upper case more word uppercase
		//package name:always lower case you may add_t diffrent words
		// veriable name:always start lower case , camel case
		
		int myNumber =10;
		int myNumber2 =100;
		
		//increase the value of myNumber2 by adding mynumber 100+10 =110
		
		myNumber2 = myNumber2+ myNumber;
		System.out.println(myNumber2);
		
		//unary operator +,-,!
		
		int num3 = -15;
		int num4 =+15;
		
		// change the value of num4 to minus num3 .
		
		num4 = -num3;
		System.out.println("Current value of num4 "+num4);
		
		// ! used to flip the value of boolean
		
		boolean lightOn = true;
		
		System.out.println(lightOn);
		System.out.println(!lightOn);
		
		//short hand assignment
		// += ,-=, *= , %=, /=
		//we can use shorthand 
		
		int score =100;
		score +=10; // same as score= score+10
		
		System.out.println("Score is "+ score);
		
		score-=100 ;// score=score-100
		
		System.out.println("Score is "+ score);
		
		score*= 3;// score = score*3
		System.out.println("Score is "+ score);
		
		score/=2; // score=score/2
		System.out.println("Score is "+ score);
		
		score%=6; // score = score %6);
		
		System.out.println("score is "+score);
		
		
		
		
	}

}
