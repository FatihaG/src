package day28_Lab4;

public class Question3 {

	public static void main(String[] args) {

		
		
		int []x= {1,2,3};
		int []y= {7,3};
		
		int []x1= {1,2,3};
		int []y1= {7,3,2};
		
		int[] x2= {1,2,3};
		int[]y2= {1,3};
		
		int []x3= {1};
		int []y3= {7,3};
		
		int[]x4= {1,2,3};
		int[]y4= {1};
		
		System.out.println(checkTheArr(x,y));
		System.out.println(checkTheArr(x1,y1));
		System.out.println(checkTheArr(x2,y2));
		System.out.println(checkTheArr(x3,y3));
		System.out.println(checkTheArr(x4,y4));
	}

	public static String checkTheArr (int[] arr1,int[] arr2) {
		
		if (!(arr1.length>1)) {
			return "Array1 is not valid";
		}
		if (!(arr2.length>1)) {
			return "Array2 is not valid";
		}
		
		if (arr1[0]==arr2[0] || arr1[arr1.length-1]==arr2[arr2.length-1]) {
			return "true";
		}else {
			return "false";
		}
		
		
		
		
	}
	
	
	
	
	
	
}
