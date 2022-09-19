package day28_Lab4;

public class Question8 {

	public static void main(String[] args) {

		int[]x= {2,5};
		int[]y= {4,3};
		int[]z= {4,5};
		
		System.out.println(torT(x));
		System.out.println(torT(y));
		System.out.println(torT(z));

		
		
	}

	
	
	public static boolean torT (int[] num) {
		
		for(int value:num) {
			
			if (value==2 ||value==3) {
				
				return true;
			}
				
			}
			return false;
			
		}	
		
		
		
	
	
}
