package day25_array_part2;

import java.util.Scanner;

public class TaskRainFall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] month= {"January","February","March","April","May","June","July","August","September","Oktober","November","December"};
		double [] rainFall=new double [12];
		double sum=0;
		
		
		Scanner sc=new Scanner (System.in);
		System.out.println(month[0]+" Rainfall is: ");
		rainFall[0]=sc.nextDouble();
		double	max=rainFall[0];
		double	min=rainFall[0];
		for (int i=1;i<month.length;i++) {
			System.out.print(month[i]+" : ");
			rainFall[i]=sc.nextDouble();
			
			sum=sum+rainFall[i];
			
			if(rainFall[i]>max) {
				max=rainFall[i];
			
			}else if (rainFall[i]<min) {
			
				min=rainFall[i];
			}
			}
		
		System.out.println("The sum of all the rain is: "+sum+ " inches");
		System.out.println("The avarage rainfall was: " + sum/12+" inches");
		System.out.println("The max rain is: "+ max+" inches");
		System.out.println("The min rain is: "+ min+" inches");
		
	}

}
