package day28_Lab4;

public class Question12 {

	public static void main(String[] args) {

		
		int[]x= {1,2,3};
		int[]y= {1,3};
		System.out.println(one(x,y));
		
		int[]x1= {7,2,3};
		int[]y1= {1};
		
		System.out.println(one(x1,y1));
		
		int[]x2= {3,2,4};
		int[]y2= {4,3,4};
		
		System.out.println(one(x2,y2));
		
	}

	public static int one (int[] a,int[]b) {
		
		int x=0;
		
		if(a[0]==1) {
			x++;
		}
		if (b[0]==1) {
			x++;
		}
		
		
		return x;
		
	}
	
	
	
	
	
}
