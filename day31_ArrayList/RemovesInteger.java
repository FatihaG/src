package day31_ArrayList;

import java.util.ArrayList;

public class RemovesInteger {

	public static void main(String[] args) {

		ArrayList<Integer> nums=new ArrayList<>();
		
		System.out.println(nums.size());
		System.out.println(nums.isEmpty());
		System.out.println(nums.size()==0);
		
		nums.add(4);
		nums.add(1);
		nums.add(44);
		nums.add(5);
		nums.add(100);
		nums.add(10);
		
		System.out.println(nums.toString());
		nums.remove(5);   //5. indexi remove yapiyor
		System.out.println(nums.toString());
		Integer n1= new Integer(5); // converting primitive to object
		Integer n2=Integer.valueOf(5);
		
		nums.remove(n1); // 5 i remove yapiyor 5'i object yaptik
		
		System.out.println(nums.toString());
		
		nums.remove(new Integer (4));
		
		System.out.println(nums.toString());
		
		
		
		
	}

}
