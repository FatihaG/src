package day30_wrapperClass;

import java.util.Arrays;

public class Task96_parsing {

	public static void main(String[] args) {

		
		String str1="Today weather is sunny and 95 degree. It is a perfect day to practice java.";
		
		// write prog. : 72 degree is equal to 22.22 celcius
		
		String [] arr = str1.split("and ");
		System.out.println(Arrays.toString(arr));
		arr=arr[1].split(" degree");
		
		String degree=arr[0];
		double degreef=Double.parseDouble(degree);
		
		double degreeC= (degreef -32)*5/9;
		
		System.out.println(degreef+ " degree is equal to "+ degreeC+ " celcius");
		
		
	}

}
