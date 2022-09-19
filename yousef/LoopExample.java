package yousef;

public class LoopExample {

	public static void main(String[] args) {
	/*	4 3 2 1
		 3 2 1
		  2 1
		   1
      */
		
		for(int row=4;row>=1;row--) {
			for(int i=0;i<=4-row;i++) {
				System.out.print(" ");
			}
			for (int col=row;col>=1;col--) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
