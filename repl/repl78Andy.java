package repl;

public class repl78Andy {

	
		  public static void main(String[] args) {
		    //DO NOT CHANGE
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
		    name = scan.nextLine();
		    
		    System.out.println("Do you have a US driver license?");
		    if(!scan.nextLine().equalsIgnoreCase("yes")){
		      System.out.println("Invalid data!");
		      System.exit(0);
		    }else{ 
		      
		          System.out.println("Enter your zip code");
		          String zip = scan.nextLine();
		          switch(zip){
		            case "20910": case "20740":
		              premium+=60;
		              break;
		            case "22102": case "22103":
		              premium+=30;
		              break;
		            default:
		              premium+=50;
		          }
		          
		          System.out.println("Is this vehicle Owned, Financed, or Leased?");
		          vehicleOwnership = scan.nextLine();
		          switch(vehicleOwnership){
		            case "Owned": case "owned":
		              premium+=10;
		              break;
		            default:
		              premium+=20;
		          }  
		          
		          System.out.println("How is this vehicle primarily used?");
		          vehicleUsage = scan.nextLine();
		          switch(vehicleUsage){
		            case "Business": case "business":
		              premium+=50;
		              break;
		            case "Pleasure": case "pleasure":
		              premium+=10;
		              break;
		            case "Commute": case "commute":
		              premium+=20;
		              
		              System.out.println("Days Driven To Work And/Or School");
		              daysDrivenToWorkOrSchool = scan.nextInt();
		              scan.nextLine();
		              premium+=daysDrivenToWorkOrSchool*5;
		              
		              System.out.println("Miles Driven To Work And/Or School");
		              milesToWorkOrSchool = scan.nextInt();
		              scan.nextLine();
		              premium+=milesToWorkOrSchool;
		              
		              break;
		          }
		          
		          
		          
		          
		          
		          System.out.println("How old are you?");
		          int age = scan.nextInt();
		          scan.nextLine();
		          if(age<16){
		            System.out.println("Invalid data!");
		            System.exit(0);
		          }else if(age>=16 && age<18){
		            premium*=20;
		          }else if(age>=18 && age<=21){
		            premium*=6;
		          }else if(age>21 && age<25){
		            premium*=2;
		          }
		          
		          System.out.println("How many years you've been driving?");
		          int experience = scan.nextInt();
		          scan.nextLine();
		          if(experience<0 || age-experience<=16){
		            System.out.println("Invalid data!");
		            System.exit(0);
		          }else {
		            premium-=experience*5;
		          }
		          
		          
		          System.out.println("Have you had any accidents in the last 5 years?");
		          String anyAccidents = scan.nextLine();
		          if(anyAccidents.equalsIgnoreCase("yes")){
		            System.out.println("How many?");
		            accidentsAmount = scan.nextInt();
		            scan.nextLine();
		            premium+=accidentsAmount*0.2*premium;
		          }
		          
		          System.out.println("Have you had continuous insurance for the past 12 months?");
		          continuousInsurance = scan.nextLine();
		          if(continuousInsurance.equalsIgnoreCase("no")){
		            premium*=2;
		          }
		          
		          System.out.println("What is the highest level of education you have completed?");
		          education = scan.nextLine();
		          switch(education){
		            case "PhD": case "Bachelors": case "Masters":
		              premium*=0.95;
		              break;
		            case "Doctors":
		              premium*=0.9;
		              break;
		            case "Less than High School":
		              premium*=1.05;
		          }
		          
		          System.out.println(name + ", here's your quote!");
		          System.out.println("Start Your Policy Today For: $" + premium);
		          referenceNumber = name.substring(0,2) + age + name.substring(name.length()-2) + zip + education.replace(" ","");
		          referenceNumber = referenceNumber.toUpperCase();
		          System.out.println("Reference number: " + referenceNumber); 
		            
		        }
		  }
		
	


	}


