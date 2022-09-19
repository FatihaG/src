package day8_ifElseIfElse;

public class task35nested {

	public static void main(String[] args) {		
		
		int n1=700;
		int n2=200;
		int n3=300;
		
		if(n1>n2&&n1>n3) {
			System.out.println("n1 is the biggest");
		}else {
			if(n2>n3) {
				System.out.println("n2 is the biggest");
			}else {
				System.out.println("n3 is the biggest");
			}
		}

		
		
		
	}

}
