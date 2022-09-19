package day4_arithmeticOperators;

public class discount {

	public static void main(String[] args) {
		//this program calculates the sale price of an item that regular priced at 59 with a %20 discount
		
		int regularPrice=59;
		double discount;
		double salesPrice;
		
		discount=regularPrice*0.2;
		salesPrice=regularPrice-discount;
		 System.out.println("regular price: $ " + regularPrice);
		 System.out.println("sales price: $ " + salesPrice);
		 System.out.println("discount amount: $ " + discount);
				
	    
	}

}
