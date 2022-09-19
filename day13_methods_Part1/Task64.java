package day13_methods_Part1;

public class Task64 {

	public static void main(String[] args) {
		star(5);

	}

	
	
	public static void star(int i) {
		for (int b=1;b<=i;b++) {
			for (int c=1;c<=b;c++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}
}
