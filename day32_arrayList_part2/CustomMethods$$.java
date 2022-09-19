package day32_arrayList_part2;

import java.util.ArrayList;
import java.util.Random;

public class CustomMethods$$ {

	public static void main(String[] args) {

		ArrayList<Integer> list=new ArrayList<>();
		
		list.add(10);
		list.add(10);
		list.add(7);
		list.add(8);
		list.add(8);
		list.add(3);
		list.add(4);
		list.add(8);
		
		printList (list);
		
		
		ArrayList<Double> doubleList= new ArrayList<>();
		
		doubleList.add(10.33);
		doubleList.add(1.22);
		doubleList.add(7.34);
		doubleList.add(3.55);
		doubleList.add(4.76);
		
		System.out.println(" ");
		double sum=sumList(doubleList);
		System.out.println(sum);
		System.out.println(Math.round(sum));
		
		
		ArrayList<Integer> list1=getList(15);
		System.out.println(list1.toString());
		
		ArrayList<Integer>rList=getRandomList(20);
		System.out.println(rList.toString());
		
		
		
	}

	public static ArrayList<Integer> getRandomList(int a){
		
		ArrayList<Integer> randomNums=new ArrayList<>();
		
		Random r=new Random ();
		for(int i=1;i<=a;i++) {
			randomNums.add(r.nextInt(101));
		
		}
        return randomNums;		
	}
	
	public static ArrayList<Integer> getList(int num) {
		
		ArrayList<Integer> newList= new ArrayList<>();
		for(int i=1;i<=num;i++) {
			newList.add(i);
		}
		return newList;
	}
	
	
	 public static void printList(ArrayList<Integer> num) {
		 
		 for (Integer n: num)
		
		 System.out.print(n+" ");
	 }
	
	 
	 public static double sumList(ArrayList<Double> num) {
		 
		 double sum=0;
		 for(Double a: num) {
			 
			 sum=sum+a;
			 
		 }
		 return sum;
	 }
	
	 
}
