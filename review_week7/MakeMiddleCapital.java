package review_week7;

public class MakeMiddleCapital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	


  
/*
 *    Write a program that will take the given String and return a version that is all lowercase except for the middle character/s. 
	If the word is even length, both middle characters should be captital
	If the word is odd length, there will only be one middle character 

	Ex: apple -> apPle
 * 
 * 
 */



	String s=makeMiddleCapital("");
}

public static String makeMiddleCapital(String str) {

	String word = "";
	str = str.toLowerCase();

	if(str.length() % 2 == 1) { // % 2 != 0

		// apple  5/2 
		String front = str.substring(0, str.length()/2);
		String middle = "" + str.charAt(str.length()/2);
		// char middle = str.charAt(str.length()/2);
		String end = str.substring(str.length()/2 +1);

		middle = middle.toUpperCase();

		return front + middle + end;
	}else {
		String front =str.substring(0,str.length()/2-1);
		String middle =str.substring(str.length()/2-1,str.length()/2+1);
		String end=str.substring(str.length()/2+1);
		middle=middle.toUpperCase();
		return front+middle+end;
	}



	
}
}