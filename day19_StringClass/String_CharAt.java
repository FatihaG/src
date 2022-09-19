package day19_StringClass;

public class String_CharAt {

	public static void main(String[] args) {
		
		String word= "Computer";
		System.out.println(word.length());
		
		System.out.println(word.charAt(0));
		System.out.println(word.charAt(1));
		System.out.println(word.charAt(2));
		System.out.println(word.charAt(3));
		System.out.println(word.charAt(4));
		System.out.println(word.charAt(5));
		System.out.println(word.charAt(6));
		System.out.println(word.charAt(7));
		
		//check is first charater is a
		String word2="Apple";
       
		if (word2.charAt(0)=='A') {
			System.out.println(true);
		}else {
			System.out.println("A is not first character");
		}
		
		
		String word3="civic";
		
		if (word3.charAt(0)==word3.charAt(4)) {
			System.out.println("the first and last characters are same ");
		}else {
			System.out.println("they are not same");
		}
		
		char first=word3.charAt(0);
		char last=word3.charAt(4);
		
		if(first==last) {
			System.out.println("first and last match");
		}else {
			System.out.println("first and last not match");
		}
		
		String word4="Java";
		char lastChar= word4.charAt(word4.length()-1);
		System.out.println("last char of "+ word4+ " is " +lastChar);
		
		
		
		
		
	}

}
