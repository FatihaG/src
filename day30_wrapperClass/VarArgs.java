package day30_wrapperClass;

public class VarArgs {

	public static void main(String[] args) {

		sum(2,4);
		sum(2,3,5,6);
		sum(5,10,50);
		
		concat("apple","orange","123","result");
		
	}

	
	
	public static void sum(int... numbers) {
		
		int sum=0;
		
		
		for (int value:numbers) {
			
			sum=sum+value;
		}
		
		System.out.println(sum);
	}
	
	public static void concat (String...strs) {
		
		String newstr="";
		
		for (String str:strs) {
		
		newstr=newstr+ str.charAt(2);
	}
		System.out.println(newstr);
}
}
