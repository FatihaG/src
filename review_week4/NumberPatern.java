package review_week4;

public class NumberPatern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*4 3 2 1
		  3 2 1
		  2 1
		  1
		*/
	/*	for(int row=4;row>=1;row--) {
		for(int col=row;col>=1;col--) {
			System.out.print(col+" ");
		}
		System.out.println();
		}
	*/	
		
	/*	4 3 2 1
		 3 2 1
		  2 1 
		   1
	*/	
		//#     space icin kullaniliyor
		//##
		//###
		
		for (int row=4;row>=1;row--) {
			//add o space in 1st itaration 4-4
			//add 1 space in 2nd           4-3
			//add 2 space in 3rd           4-2
			//add 3 space in 4th           4-1
			for (int i=0;i<=4-row;i++) {
				System.out.print(" ");
			}
			
		
		for (int col=row;col>=1;col--) {
			System.out.print(col+" ");
		}
		System.out.println();
		
		}
		
		
		
		/*4 3 2 1
		    3 2 1
		      2 1
		        1
		*/
	}

}
