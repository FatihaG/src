package day13_methods_Part1;

public class task58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		graterNumber();
	}

	public static void graterNumber() {
		
		int a=45;
		int b=23;
		
		if (a>b) {
			System.out.println("number "+a+" is bigger than number "+b);
		}else if (b>a){
			System.out.println("number "+b +" is bigger than number "+ a);
		}else {
			System.out.println("number are equal");
		}
		
	}

}
