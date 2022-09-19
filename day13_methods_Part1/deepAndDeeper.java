package day13_methods_Part1;

public class deepAndDeeper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("i'm starting in main");
		deep();
		System.out.println("i'm back in main");
		
	}

	public static void deep() {
		System.out.println("i'm in deep");
		deeper();
		System.out.println("i'm back in deep");
	}

	public static void deeper() {
		System.out.println("i'm in deeper");
		
	}

}
