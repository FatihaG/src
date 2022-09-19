package denemeler;

public class methodOverloading {

	public static void main(String[] args) {
	
		
		sum ((byte)20,35);
		

	}

	public static void sum(byte a) {
        System.out.println("long");
	}
	
	public static void sum(byte a,int b) {
		System.out.println("integer");
	}
	
	
}
