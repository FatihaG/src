package day24_ArrayPart1;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] myList = {10,20,30,40};
		
		String [] myArray= {"Apple","Orange","Watermelon"};
		
		System.out.println(myList[0]);
		System.out.println(myList[1]);
		System.out.println(myList[2]);
		System.out.println(myList[3]);
		
		System.out.println(myList.length);
		System.out.println(myArray.length);
		
		for(int i=0;i<myList.length;i++) {
			System.out.println(myList[i]);
		}
		
		
		int [] scores= {80,78,4,56,87,90,23,46,24,99,89,90,100,35,60,72,30,64,2,3,5,76};
		int sum=0;
		for (int i=0;i<scores.length;i++) {
			sum=sum+scores[i];
		}
		
		System.out.println("Sum is "+ sum);
		System.out.println("total element is "+ scores.length);
		System.out.println("the avarage is "+ sum/scores.length);
	}

}
  