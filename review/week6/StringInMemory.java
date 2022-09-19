package review.week6;

public class StringInMemory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="abc"; //"abc" is String literal
		String s3="abc";
		String s2= new String("abc"); // using new keyword
		String s4=new String ("abc");
		// Strings are objects 
		//they are stored in the heap
		//String pool (string constant pool)
		// a very special area in the heap to store unique string literal
	
	System.out.println(s1==s3);
	System.out.println(s1==s2);//this checking they have same adress to same object
	System.out.println(s2==s4);
	
	
	//this checking they have same content
	System.out.println(s1.equals(s2));
		//s2=s4;
		//System.out.println(s2==s4);
		
	}

}
