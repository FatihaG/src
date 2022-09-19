package day26_array_part3;

public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str="It will display the array of the size";
		
		String [] arr=str.split(" ");
		
		System.out.println(arr.length);
		
		for(String value:arr) {
		System.out.println(value);
		
		}
		
		System.out.println(arr[2]);
		System.out.println(arr[4]);

	
	
	}
}
