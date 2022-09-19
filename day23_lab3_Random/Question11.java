package day23_lab3_Random;

public class Question11 {

	public static void main(String[] args) {
		
		System.out.println(countHi("abc hi ho"));
		System.out.println(countHi("ABChi hi"));
		System.out.println(countHi("hihi"));
		
	}

	public static int countHi(String a) {
		
		int count=0;
		for (int i=0;i<a.length()-1;i++) {
			
			
           if (a.substring(i,i+2).equals("hi")) {
        	   count++;
           }
			
		}
		return count;
	}
	 
	
}
