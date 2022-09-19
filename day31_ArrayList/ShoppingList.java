package day31_ArrayList;

import java.util.ArrayList;

public class ShoppingList {

	public static void main(String[] args) {

		ArrayList<String> shoppingList=new ArrayList<>();
		
		shoppingList.add("Paper towel");
		shoppingList.add("dish soap");
		shoppingList.add("trash bag");
		shoppingList.add("clorox");
		shoppingList.add("gloves");
		shoppingList.add("shovel");
		
		System.out.println(shoppingList.size());
		
		// print all in single line
		System.out.println(shoppingList.toString());
		
		for(String a:shoppingList ) {
			
			System.out.print(a+" ");
			
		}
		
		System.out.println(" ");
		//print first and last item  
		
		System.out.println(shoppingList.get(0)+" "+shoppingList.get(shoppingList.size()-1));
		
		shoppingList.remove("Paper towel");
		shoppingList.remove("shovel");
		
		System.out.println(shoppingList.toString());
		System.out.println(shoppingList.get(0));
		
		shoppingList.remove(0);
		System.out.println(shoppingList.toString());
		
		//print each item
		
		for (String item: shoppingList) {
			System.out.println(item);
		}
		
		//remove all items at once
		
		shoppingList.clear();
		System.out.println(shoppingList);
		
		
	}

}
