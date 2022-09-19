package review_week10;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {

	public static void main(String[] args) {

		ArrayList<Integer> list1=new ArrayList<>();
		list1.add(10);
		list1.addAll( Arrays.asList(1,2,3,4,5,6,7));
		System.out.println("size: "+ list1.size());
		
		list1.add(0, 20);
		list1.set(4,30);
		System.out.println(list1);
		System.out.println(list1.get(5));
		
		System.out.println("=====================");
		
		//duplicate remove
		ArrayList<Integer> list2=new ArrayList<>();
		list2.addAll(Arrays.asList(1,1,2,2,2,3,3,3,4,4,4,5,6,6,7,7,7));
		ArrayList<Integer> nondup=new ArrayList<>();
		
		for (int each: list2) {
			if(!nondup.contains(each)) {
				nondup.add(each);
				
				
			}
			
		}
		System.out.println(nondup);
		
		
	}

}
