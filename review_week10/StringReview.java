package review_week10;

public class StringReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="cybertek";
		str.toUpperCase();
		
		System.out.println(str);
		
		String name="I love Java";
		String language=name.substring(name.lastIndexOf(" ")+1);
		System.out.println(language);
		
		
		String s1="Cybertek";
		String s2=new String("Cybertek");
		System.out.println(s1.equals(s2));
		
		
		
	}

}
