package assignments;

public class assigment3 {

	public static void main(String[] args) {
		// question1
		
		int gallon=15;
		double liter= gallon*4.54609;
		System.out.println(gallon + " gallon is "+liter+ " liter");
		
		//question2
		
		int birth=1980;
		int age=2020-birth;
		String isim= "Fatiha";
		
		System.out.println("Hello "+ isim+ "! Based on your input, your age is "+ age+ " :)");
		
		
//question3
		
		double width=4.5;
		double height=7.9;
		double area= width*height;
		System.out.println(area);
		
		// question4
		
		int num3, num1=80;
		int num2=20;
		 
		 num3=num1;
		 num1=num2;
		num2=num3;
		System.out.println("n1="+ num1);
	
		System.out.println("n2="+ num2);
		
		//question5
		int inputSecond=3695;
		int hour=inputSecond/(60*60);
		int minutes=inputSecond % (hour*60*60)/60;
		int seconds=inputSecond-(hour*60*60)-(minutes*60);
		
		System.out.println("inputSecond is " + inputSecond );
		System.out.println(hour + " hours, "+ minutes + " minutes, "+ seconds +" seconds");
		
		
		//question6
		int numMgCaf=500; 
				
		int lethalOverdosemg=10*1000;
		
		int howManyDrink=lethalOverdosemg/numMgCaf;
		
		System.out.println("Number of milligrams in drink: "+ numMgCaf);
		System.out.println("It would take about "+ howManyDrink + " drinks for a lethal overdose ");
		
		
		//question7
		int nickel=5;
		final int dolar=20*nickel;
		final int dime=2*nickel;
		final int quarter=5*nickel;
		int price=35;
		int changeQuarter=( dolar-price)/quarter;
		int changeDime=((dolar-price)-(changeQuarter*quarter))/10;
		int changeNickel= ((dolar-price)-(changeQuarter*quarter)-(changeDime*dime))/5;
				
		System.out.println("Price in cents : "+ price);
		System.out.println("Your change is "+ changeQuarter+ " quarters, "+ changeDime+ " dimes, and "+ changeNickel +" nickles");
		
		
		
		
		 
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
