package review_week7;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
		//handles even and odd
		// dad 3/2 1
		// anna 4/2 2
	
	   // racecar
		//0 r != r
		//1 a != a
		//2 c != c
		//3 -> 7/2=3<3--> stops loop
	public static boolean isPalindrome(String str) {
		
		for(int i=0;i<str.length()/2;i++) {
			
			
			if (str.charAt(i)!=str.length()-1-i) {
				return false;
			}
		}
		
		
		
		
		return true;
	}
	
	
	
	
	
	
}
