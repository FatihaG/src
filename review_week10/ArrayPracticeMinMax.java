package review_week10;

public class ArrayPracticeMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] numbers={10,20,5,4,3,2,1,40,30,45};
		
		int max=numbers[0];
		int min=numbers[0];
		int sum=0;
		
		
		for( int each:numbers) {
			//if (each> max) { max=Math.max(each,max);
				//max=each;
			//}
		max=Math.max(each,max);
			//if (each<min) {
				//min=each;
			//}
		
		min=Math.min(each,min);
		sum+=each;
		
		}
		double average=(double)sum/numbers.length;
		
		//DecimalFormat df=new DecimalFormat("0.00");
		
		System.out.println("max "+max);
		System.out.println("min "+ min);
		System.out.println("Average "+average);
	}

}
