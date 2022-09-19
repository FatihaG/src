package review_week4;

public class LoopIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// below is the infinite loop situation because 10 is forever more than 0
		//int x=10;
		//while (x>0) {
			//System.out.println("do something here");
			
		//}
		
		int x=0;
		while (x<=10) {
			System.out.print(x+" ");
			x++;
		}
		
		int y=0;
		do {
			//do some stuff here
			System.out.print(y+" ");
			y++;
		}while (y<=10);
		
		System.out.println();
		
		for(int k=0; k<=10;k++) {
			System.out.print(k+" ");
		}
		
		
		
		
	}

}
