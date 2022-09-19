package review_week4;

public class FizzBuzzTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//from 1-100
		// if the number can be divisible by 3 ,print fizz
		// if the number can be divisible by 5, print buzz
		//if the number can be divisible both 3 and 5 print fizzbuzz
		
		for( int i=1;i<=100;i++) {
			if (i%3==0&&i%5==0) { //i%15
				System.out.println(i+" fizzBuzz!!");
				
			}else if (i%3==0) {
				System.out.println(i+" fizz!!");
				
			}else if (i%5==0)
				System.out.println(i+" buzz!!");
		}
		
		
		
		
		
	}

}
