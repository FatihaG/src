package review_week8;

public class ReverseEachWords {

	public static void main(String[] args) {

		// a method will accept a string 
		// each word reverse
		System.out.println(reverseEachWord("I love learning java"));
		
	  

		
	}

	public static String reverseEachWord (String str) {
		
		String [] words=str.split(" ");
		
		String reverse="";
		
		
		
		for (String word : words) {
			
			String reverseEach="";
			
			for(int i=word.length()-1;1>=0;i--) {
				
				reverseEach+=word.charAt(i);
			}
		
			//reverse+=reverseEach+ " ";
		}
		return reverse.trim();
		
	}
	
	

	}
	



