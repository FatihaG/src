package review_week7;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isAnagram("abc","cab"));
		System.out.println(isAnagram("aaaaa","cab"));
		System.out.println(isAnagram("listen","silent"));
		
		
	}

	public static boolean isAnagram (String one, String two) {
		//
		
		if (one.length()!=two.length()) {
			return false;
		}
		for (int i=0;i<one.length();i++) {
			two=two.replaceFirst(""+one.charAt(i),"");
		one.to
			
		}
		return two.isEmpty();
	}
	
	
	
	
}
