package day31_ArrayList;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {

		//Languages
		//print size
		//read couple of elements
		
		ArrayList<String> languages =new ArrayList<>();
		
		languages.add("English");
		languages.add("German");
		languages.add("Polish");
		languages.add("Turkish");
		languages.add("Urdu");
		
		System.out.println("Number of values: "+languages.size());
		System.out.println(languages.get(2));
		System.out.println(languages.get(3));
		System.out.println(languages.get(4));
		System.out.println(languages.toString());	
		languages.add("Russian");
		System.out.println(languages.toString());	
		
		languages.remove(0);
		System.out.println(languages.toString());	
		System.out.println("Number of values: "+languages.size());
		
		
	
		
		
		
		
		
	}

}
