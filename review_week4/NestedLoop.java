package review_week4;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//count from1 to 5
		// and repeat above action 5 times
		for (int x=1;x<=5;x++) {
			
			for (int i=1; i<=5;i++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		//	System.out.println("***************");
		//for (int row=1;row<=5;row++) {
			
			//for (int column=1; column<=5;column++) {
				//System.out.print(column+" ");
			//}
			//System.out.println();
		//}
		
		System.out.println("***************");
		for (int row=1;row<=5;row++) {
			
			for (int col=1;col<=row;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
	}

}
