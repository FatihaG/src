package repl;

import java.util.Scanner;

public class repl_78 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double premium = 0;
		int accidentsAmount = 0;
		int daysDrivenToWorkOrSchool = 0;
		int milesToWorkOrSchool = 0;
		String vehicleOwnership = "";
		String vehicleUsage = "";
		String continuousInsurance = "";
		String education = "";
		String name = "";
		String referenceNumber = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the CountyFarm car insurance!");
    //WRITE YOUR CODE HERE
    
    System.out.println("Enter your name");
    name=scan.nextLine();
    System.out.println("Do you have a US driver license?");
    String licence=scan.next();
    if(!(licence.equalsIgnoreCase("yes"))){
      System.out.println("Invalid data!");
      System.exit(0);
    }
    System.out.println("Please provide a zip code");
    int zip=scan.nextInt();
    scan.nextLine();
    if(zip==20910 || zip==20740) {
    	premium+=60;
    }else if (zip==22102||zip==22103) {
    	premium+=30;
    }else {
    	premium+=50;
    }
    System.out.println("Is this vehicle Owned,Financed,or Leased?");
    
    vehicleOwnership=scan.next();
    if (vehicleOwnership.equalsIgnoreCase("owned")) {
    	premium+=10;
    }else {
    	premium+=20;
    }
    System.out.println("How this vehicle primarly used?");
    vehicleUsage=scan.next();
    if(vehicleUsage.equalsIgnoreCase("Business")) {
    	premium+=50;
    }else if (vehicleUsage.equalsIgnoreCase("Pleasure")) {
    	premium+=10;
    }else if (vehicleUsage.equalsIgnoreCase("commute")) {
    	premium+=20;
    
    
    System.out.println("Days Driven To Work And/Or School");
    daysDrivenToWorkOrSchool=scan.nextInt();
    premium+= daysDrivenToWorkOrSchool*5;
    
    System.out.println("Miles Driven To Work And/Or School");
    milesToWorkOrSchool=scan.nextInt();
    premium+=milesToWorkOrSchool;
    }
    
    System.out.println("How old are you?");
    int age=scan.nextInt();
    
    if(age<16) {
    	System.out.println("Invalid data!");
    	System.exit(0);
    }else if (age>16 && age<18) {
    	premium*=20;
    }else if(age>=18 && age<=21) {
    	premium*=6;
    }else if(age>21 && age<25) {
    	premium*=2;
    }
    
    System.out.println("How many years have you been driving?");
    int howLong=scan.nextInt();
    scan.nextLine();
    if(!(howLong>0 && (age-howLong)>=16)) {
    	System.out.println("Invalid data!");
    	System.exit(0);
    }else {
    premium-=howLong*5;
	}

    System.out.println("Have you had any accidents in last 5 years? ");
     String accident=scan.next();
     if (accident.equalsIgnoreCase("yes")) {
    	 System.out.println("How many?");
    	 accidentsAmount=scan.nextInt();
    	 premium+=premium*accidentsAmount*20/100;
    	 
     }
     System.out.println("Have you had continuous insurance for past 12 months?");
     continuousInsurance=scan.next();
     if (continuousInsurance.equalsIgnoreCase("no")) {
    	 premium*=2;
     }
     
     System.out.println("What is the highest level of education you have completed?");
     education=scan.next();
     
     if (education.equalsIgnoreCase("Phd")|| education.equalsIgnoreCase("Bachelors")|| education.equalsIgnoreCase("Master")) {
    	 premium-=premium*5/100;
     }else if (education.equalsIgnoreCase("doctors")) {
    	 premium-=premium*10/100;
     }else if (education.equalsIgnoreCase("less than high school")) {
    	 premium+=premium*5/100;
     }
     
     System.out.println(name+",here's your quote!");
     System.out.println("Start Your Policy Today For:$"+premium);
     
     referenceNumber=(name.substring(0,2)+age+name.substring(name.length()-2)+zip+education).toUpperCase();
     System.out.println("Reference number: "+ referenceNumber );
	}
     
}
