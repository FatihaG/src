package review_week4;

public class LoopControlStatementInNestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 /*  outer: //leble for outer loop,
			for (int row=1;row<=5;row++) {
			
			for (int column=1; column<=5;column++) {
				System.out.print(column+" ");
				if (column==3) {
					break outer;
				}
			}
		System.out.println();
		}
		*/
	outer: //leble for outer loop,
		for (int row=1;row<=5;row++) {
		
		for (int column=1; column<=5;column++) {
			
		// skip to next row if you see column 3
			
			if (column==3) {
				continue outer;
			}
			System.out.print(column+" ");
		}
	System.out.println();
	}

	}

}
