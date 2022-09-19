package day23_lab3_Random;

public class Question13 {

	public static void main(String[] args) {
		
		
		System.out.println(str("The"));
		System.out.println(str("java"));
		System.out.println(str("Hi-there"));
	}

	public static String str (String a) {
		
		String newString="";
	  for (int i=0;i<a.length();i++) {
		  newString=newString+a.substring(i,i+1).concat(a.substring(i,i+1));
	  }
	  return newString;
	}
}
