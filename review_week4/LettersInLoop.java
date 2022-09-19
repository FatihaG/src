package review_week4;

public class LettersInLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * ABCDEFG
		 */
		
	/**	char c1='A';
		++ c1;  //c1= 65+1=66  char(66)-->'b'
		System.out.println(c1);
		++ c1;
		System.out.println(c1);
		++ c1;
		System.out.println(c1);//D
	    
		--c1;
		System.out.println(c1);
	*/
	//if you increment a char variable you will get next character
	//if you decrement ...	                        previous
		
		
		//for (char letter='A'; letter<= 'Z';letter++) {
			//System.out.print(letter+" ");
		//}
		
		for (char endingChar='D';endingChar>='A';endingChar--) {
		for (char letter='A'; letter<= endingChar;letter++) {
			System.out.print(letter+" ");
		}
		System.out.println();
		}
		
		
	}
	
	

}
