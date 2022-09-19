package yousef;

public class yousef_meeting {

	public static void main(String[] args) {
		// TODO Auto-generated method stubint n1 = 10;
		int n2 = 20;
 		int n1=10;
		/*
		//Option-1
		int n3;
		
		n3 = n1;
		n1 = n2;
		n2 = n3;
		
		System.out.println("n1="+n1);
		System.out.println("n2="+n2);
		*/
		
		//Option-2
		
		n2 = n1 + n2; //n2=30
		n1 = n2 - n1; //30-10=20 -> n1=20, n2= 30
		n2 = n2 - n1; //n2=10 
		
		System.out.println("n1="+n1);
		System.out.println("n2="+n2);
		
		
		


	}

}
