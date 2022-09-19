package day14;

public class task67 {

	public static void main(String[] args) {
	
		lastDigit(47,17);
		
		lastDigit(6,17);
		
		lastDigit (33,113);

	}

	public static void lastDigit(int num1,int num2) {

		if (num1%10==num2%10) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
	}
	
	/*public static main
	 * if (lastDigit(7,17)){
	 * System.out.println("thay have same last digit);
	 * }else{
	 * System.out.println("they dont have");
	 * }
	 * }
	 * public static boolean lastDigit(int num1,int num2){
	 * if ((num1%10)==(num2%10)){
	 * return true;
	 * }else{
	 * return false;
	 * }
	 */
}
