package review_week10;

import java.sql.Array;
import java.util.Arrays;

public class ArraysPractice3 {

	public static void main(String[] args) {

		// anagram
		String s1="ERFEEZOMBB".toLowerCase().replace(" ","" );//"Silent".toLowerCase();
		String s2="freezeBomb".toLowerCase().replace(" ","");//"Listen".toLowerCase();
		
		char [] ch1=s1.toCharArray(); //[s,i,l,e,n,t]
		char [] ch2=s2.toCharArray();
		 Arrays.sort(ch1);
		 Arrays.sort(ch2);
		 
		boolean isAnagram=Arrays.equals(ch1, ch2);
		System.out.println(Arrays.toString(ch1));
		System.out.println(Arrays.toString(ch2));
		System.out.println(isAnagram);
		
		
		
	}

}
