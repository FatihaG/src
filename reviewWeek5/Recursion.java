package reviewWeek5;

public class Recursion {

	public static void main(String[] args) {
		// recursion: a method calling itself: but why????
		
		
		printNumber(10);
		System.out.println("-------------------");
		printNumberLowToHigh(3);

	}
	
	public static void printNumberLowToHigh(int num) {
	if (num >10) {
		System.out.println("end!");
		return;
	}
	System.out.print(num+" ");
	printNumberLowToHigh(num+1);
	}
	public static void printNumber(int n) {
		
		// call printNumber with different number below
		//for example one less than the value of n
		
		if (n==0) {
			System.out.println("The end!");
			return;
		}
		System.out.println(n);
		
		printNumber(n-1);
		
	
		
	}
	
	
	
	
}
