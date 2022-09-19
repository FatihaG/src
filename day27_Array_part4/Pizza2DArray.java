package day27_Array_part4;

import java.util.Arrays;

public class Pizza2DArray {

	public static void main(String[] args) {

		String [][] ingrediends= {
				{"pinneapple","pepperoni"},
				{"anchovies","mushroom","olives"},
				{"4 cheese"},
				{"chicken","tomatoes","onioons"},
				{"green peppers","zuccini","brocoli","Spinach","shrimp"}
		};
		
		System.out.println(Arrays.toString(ingrediends[0]));
		
		System.out.println("----FOR EACH LOOP-----");
		for (String[] pizza: ingrediends) {
			System.out.print(pizza.length+ "-");
			System.out.println(Arrays.toString(pizza));
		}
		
		System.out.println("-----FOR ITERATER LOOP----");
		
		for(int i=0;i<ingrediends.length;i++) {
		System.out.print(ingrediends[i].length);
		System.out.println(Arrays.toString(ingrediends[i]));
		}
		
		
		
			System.out.println("------------");
			 for (String pizzam: ingrediends[3]) {
				 
				 System.out.println(pizzam);
			 }
			
		
			 int [][]students= {{4,5,6},{12,5,7},{23,56,12,55,3}}; //each row is array int[] inside 2d array int[][]
			 
			 for(int [] num : students) {
				 for(int  num1: num) {
					 System.out.print(num1+" ");
				 }
			 }
				 
		
		
		
	}

}
