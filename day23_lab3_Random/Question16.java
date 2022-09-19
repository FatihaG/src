package day23_lab3_Random;

public class Question16 {

	public static void main(String[] args) {
		
		System.out.println(palindrom("racecar"));
		System.out.println(palindrom("Taco cat"));
	}

	public static boolean palindrom (String a) {
		String textA="";
		
		for (int i=a.length()-1;i>=0;i--) {
			textA=textA+a.charAt(i);
		}
		if (a.replace(" ","").equalsIgnoreCase(textA.replace(" ",""))) {
			return true;
		}else {
			return false;
		}
	}
		
}	
	