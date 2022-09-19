package day29_Lab4;

import java.util.Arrays;

public class Question23 {

	public static void main(String[] args) {

		number(4);
		number(1);
		number(10);
		System.out.println(Arrays.toString(number(4)));
		System.out.println(Arrays.toString(number(1)));
		System.out.println(Arrays.toString(number(10)));
		
	}
	public static int [] number(int arr) {
		int [] abc=new int[arr];
		for(int i=0;i<abc.length;i++) {
			abc [i]=i;
			}
		return abc ;
	}
}
