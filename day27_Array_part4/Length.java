package day27_Array_part4;

public class Length {

	public static void main(String[] args) {

		int [][] numbers= {
				{1,2,3,4},//row1
				{5,6},    //row2
				{9,10,11,12,23,30,40}//row
		};
		
		//display the number of rows
		
		System.out.println(numbers.length);
		// display the number of columns in each row
		
		for (int i=0;i<numbers.length;i++) {
			System.out.println("the number of columns in row "+ i + " is "+ numbers[i].length);
			
		}
		
		for(int i=0;i<numbers.length;i++) {
			
			for (int j=0;j<numbers[i].length;j++) {
				
				System.out.print(numbers[i][j]+" , ");
				
			}
			
		}
		
		
		}
		
		
	

}
