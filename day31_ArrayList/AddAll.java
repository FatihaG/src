package day31_ArrayList;

import java.util.ArrayList;

public class AddAll {

	public static void main(String[] args) {

		ArrayList<String> l1= new ArrayList<>();
		
		
		l1.add("Java");
		l1.add("JS");
		
		ArrayList<String> l2= new ArrayList<>();
		
		l2.add("C#");
		l2.add("C++");
		
		l2.addAll(l1);
		System.out.println(l2.toString());
		
		l1.addAll(l2);
		System.out.println(l1);
		
		
	}

}
