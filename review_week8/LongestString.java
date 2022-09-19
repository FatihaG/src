package review_week8;

public class LongestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a method that will accept a String array and return a String 
		//which is the biggest word in the whole array.
		//The words will all have different lengths 
				   // Ex: [ "Monday", "Apple", "Banana", "Strawberry", "Lion" ] -> Strawberry
	
	String[] words= {"Monday", "Apple", "Banana", "Strawberry", "Lion"};
	
	System.out.println(findLongestString(words));
	
	}
	
	public static String findLongestString(String [] words) {
		
		String longestWord = "";
		
		for(String word : words) {
			
			if(word.length() > longestWord.length()) {
				longestWord = word;
			}
			// one more condition to check if equal, concat	
		}
		return longestWord;
}
	
	
}
