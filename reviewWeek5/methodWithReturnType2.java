package reviewWeek5;

public class methodWithReturnType2 {

	public static void main(String[] args) {
		
		int result=getTheSumOfNumberFrom1to100();
		System.out.println(result);
		System.out.println(getTheSumOfNumberFrom1to100());
		
		int result1= getTheSumOfNumberFrom1toN(100);
		int result2= getTheSumOfNumberFrom1toN(10);
		int result3= getTheSumOfNumberFrom1toN(55);
		
		System.out.println("sum 1to100"+ result1);
		System.out.println("sum 1 to 10"+result2);
		System.out.println("sum 1 to 55"+result3);
		
		int result4=getTheSumOfNumberFrom1toN(-1);
		
		System.out.println("sum "+ result4);
	}
	public static int getTheSumOfNumberFrom1toN(int endingNumber) {
		int sum=0;
		for (int i=1; i<=endingNumber;i++) {
			sum=sum+i; //sum+=i;
		}
		return sum;
	}
	
	
	
	//create a method that get sum of number from 1 to 100
	//no parameter and return the sum
	public static int getTheSumOfNumberFrom1to100() {
		int sum=0;
		for (int i=1; i<=100;i++) {
			sum=sum+i; //sum+=i;
		}
		return sum;
	}
}