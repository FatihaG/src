package review_week3;
import java.util.Scanner;

public class switchWithString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	//string equality
		String str1="Adam";
		String str2="Adam";
		
		//checking the content of str1 and str2 equals or not
		//we use equals method
		
		boolean isSame=str1.contentEquals(str2);

		System.out.println(isSame);
		*/
		
			//String season= "Summer";
			
			/*
			 * if (season.contentEquals("Spring")) {
				System.out.println("picnic!!");
			}else if (season.equals("Summer")){
				System.out.println("swimming!");
			}else if (season.contentEquals("Fall")) {
				System.out.println("hiking!");
			}else if (season.contentEquals("winter")) {
				System.out.println("skiing!");
			}else {
				System.out.println("invalid season!");
			}
		*/
			Scanner blabla=new Scanner(System.in);
			
			System.out.println("what is the season?");
		String season= blabla.next();
		
		switch (season) {
		
		case "Spring":
			System.out.println("picnic");
			break;
		case "Summer":
			System.out.println("Swimming");
			break;
		case "Fall":
		case "Autumn"://if you want to take same action for both cases!
			System.out.println("Hiking");
			break;
		case "winter":
			System.out.println("Skiing");
			break;
		default:
			System.out.println("keep coding");
			
			
			
		}
		
			
			      
			
	}

}
