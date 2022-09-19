package day48_collection_part3;

import java.util.*;

import day46_collection_part1.Product;

public class HashSetOfProducts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//create set collection add new products
		
		Set <Product> prodSet= new HashSet<>();
		
		prodSet.add(new Product("book", 25.99));
		prodSet.add(new Product("book", 17.99));
		prodSet.add(new Product("magazine", 7.99));
		
		
		System.out.println(prodSet.toString());
		
		//print each product by using for each loop
		for(Product p: prodSet) {
			System.out.println(p.getPrice());
		}
		
		//print each product by using for each method
		
		prodSet.forEach(p-> System.out.println(p.getName()));
		
		
		
		
		
	}

}
