package review_week9;

import java.util.ArrayList;

public class Extractletters {

	public static void main(String[] args) {
		//Create a method that will accept a String and a boolean.
	    // If the given boolean is true then extract the uppercase letters and return them in an ArrayList.
	     //If the given boolean is false then extract all of the lowercase letters and return them in an ArrayList

        System.out.println(extractLetter("hgdhghVHASFbhsghvjhsgJ",true));
		
        System.out.println(extractLetter("hgdhghVHASFbhsghvjhsgJ",false));
	}
	
	
	
	public static ArrayList<Character> extractLetter (String str,boolean check){
		
		
		ArrayList<Character> letters=new ArrayList<>();
		
		for (int i=0;i<str.length();i++) {
		 char eachChar=str.charAt(i);
		 
		if(check) {
			//uppercase
		 if (eachChar>=65 && eachChar<='Z') {
			
			 letters.add(eachChar);
		 }
			
		}else {
			//lowercase
			if (Character.isLowerCase(eachChar)) {//if (eachChar>='a' && eachChar<='z')
				
				letters.add(eachChar);
			}
			
		}
		}
		return letters;
	}

}
