package assignments;


	import java.util.Scanner;
public class lab2 {

	public static void main(String[] args) {
		
		System.out.println("QUESTION 1");
		
		
		
		
		
		
		
		
		System.out.println();
		System.out.println("QUESTION 2");
		Scanner s2=new Scanner(System.in);
		System.out.println("How many cookies have you eaten?");
		
		int numCookie=s2.nextInt();
		
		int calorie=numCookie*(300/4);
		
		System.out.println("You consumed "+ calorie+ " calories in total! \nBe careful! :) ");
		
		System.out.println();
		System.out.println("QUESTION 3");
		
		Scanner s3=new Scanner (System.in);
		
		System.out.println("Please enter a pozitive nonzero a whole number. ");
	     
		int num=s3.nextInt();
		
		int sum=0;
		
		for (int i=1;i<=num;i++) {
		
		sum=sum+i;}
		
		 System.out.println("Sum of the all the whole number from 1 to "+num+ " is: "+ sum);
		
		System.out.println();
		System.out.println("QUESTION 4");
		Scanner s4=new Scanner (System.in);
		
		System.out.println("Please enter the number of females student in the class");
		int female=s4.nextInt();
		System.out.println("Please enter the number of males student in the class");
		int male=s4.nextInt();
		
		int total=female+male;
		int pFS=(female*100)/total;
		int pMS=(male*100)/total;
		
		System.out.println("The percentage of female student in the class is: "+pFS+"\nThe percentage of male student in the class is: "+pMS);
		// I used int , because it is stupid to give the percentage in double , i think !
		
		System.out.println();
		System.out.println("QUESTION 5");
		
		Scanner s5=new Scanner(System.in);
		
		System.out.println("Please enter the charge for the meal");
		double meal=s5.nextDouble();
		
		double taxMeal=meal*6.75/100;
		double tipMeal=(meal+taxMeal)*20/100;
		System.out.println("Your meal charge is: "+meal+"\nYour tax amount is: "+taxMeal+"\nYour tip amount is: "+tipMeal+"\nTotal bill is: "+(meal+taxMeal+tipMeal)+"\nEnjoy!");
		
		System.out.println();
		System.out.println("QUESTION 6");
		
		Scanner s6 =new Scanner (System.in);
		System.out.println("Please enter the amount of a purchase");
		double purchase= s6.nextDouble();
		double stateTax=purchase*4/100;
		double countyTax=purchase*2/100;
		double totalTax=countyTax+stateTax;
		double totalP=purchase+totalTax;
		
		System.out.println("The amount of the purchase is :"+purchase+"\nThe state tax is: "+stateTax+"\nThe county tax is: "+countyTax+"\nthe total sales tax is: "+totalTax+"\nThe total of sale is: "+totalP);
		
		
		
		
		
		
		
		
		
		
	}

}
