package day27_Array_part4;

import java.util.Arrays;

public class ArrayClass {

	public static void main(String[]args) {
		
		//toString()

		int []nums= {43,12,4,1,3,5};
		
		System.out.println(Arrays.toString(nums));
		
		//equals ()
		
		int [] nums1= {4,5,6,10,100};
		int [] nums2= {4,5,6,10,100};
		
		System.out.println(Arrays.equals(nums1, nums2));
		
		//sort()
		
		Arrays.parallelSort(nums);
		System.out.println(Arrays.toString(nums));
		
		String[] languages= {"Zulu","Spanish","Itailan","English","1Polish","arabic","@abc"};
		Arrays.parallelSort(languages);
		System.out.println(Arrays.toString(languages));
		
		
		//binarySearch()
		
		int[]numX= {4,6,7,10,45};
		System.out.println(Arrays.binarySearch(numX,7));//2
		System.out.println(Arrays.binarySearch(numX, 45));//4
		System.out.println(Arrays.binarySearch(numX, 5));//-2 (-(insertPoint)-1)
		System.out.println(Arrays.binarySearch(numX,15));//-5 first sort it then find the closest
		
		
		//copyOf()
		
		double[] d1= {2.3,4.5,12.4};
		double[] d2=d1;
		
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));
		
		d1[0]=100.3;
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));
		
		d2[1]=400.5;
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2)); 
		 
		// birindeki degisiklik ikisini de degistiriyor cunku ayni object sadece referans adrsi farkli

		
		//double [] d3= Arrays.copyOf(d2,d2.length);
		double[]d3=Arrays.copyOf(d2,5);
		System.out.println(Arrays.toString(d3));

		d2[0]=5.2;
		System.out.println(Arrays.toString(d2));
		System.out.println(Arrays.toString(d3)); // d3 e d2 yi kopyaliyor ama d2 degisince d3 degismiyor cunku ayni object degil.


	}
	
	
	
	
}
