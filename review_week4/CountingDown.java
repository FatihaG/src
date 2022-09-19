package review_week4;

public class CountingDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=10;
		while (x>=0) {
			System.out.print(x+" ");
			x--;
		}
		System.out.println();
		int y=10;
		do {
			System.out.print(y+" ");
			y--;
		}while (y>=0);
		
		System.out.println();
		
		for (int k=10;k>=0;k--) {
			System.out.print(k+" ");
		}
	}

}
