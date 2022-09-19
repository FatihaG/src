package day48_collection_part3;

import java.util.*;
import java.util.List;

public class MapExample {

	public static void main(String[] args) {

		List<Integer> items2= new ArrayList<>();
		items2.add(10);
		
		Map<String, Double> items=new HashMap<>();
		
		items.put("Apple", 3.49);
		
		items.put("flowers", 10.99);
		
		items.put("Eggs", 4.99);
		
		items.put("Milk", 6.00);
		
		items.put("cherries",5.99);
		
		items.put("Milk", 5.49);//yeni bir key olusturmuyor sadece value i guncelliyor
		
		System.out.println(items.size());
		
		System.out.println(items.toString());
		
		System.out.println(items.isEmpty());
		
		System.out.println(items.get("Apple"));
		System.out.println(items.get("Milk"));
		
		items.remove("flowers");
		
		System.out.println(items.toString());
		
		System.out.println("is Apples there? "+ items.containsKey("Apple"));
		
		System.out.println("is flowers there? "+ items.containsKey("flowers"));
		
		items.replace("Eggs", 3.5);
		
		System.out.println("price of Eggs: "+ items.get("Eggs"));
		
		//increase price of cherries by 2$
		
			items.replace("cherries",items.get("cherries")+2); 
		
			System.out.println("price of cherries:"+ items.get("cherries"));
			
		
		
		
		
	}

}
