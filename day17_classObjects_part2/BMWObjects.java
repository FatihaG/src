package day17_classObjects_part2;

public class BMWObjects {

	public static void main(String[] args) {
		
		BMW b1=new BMW();
		BMW b2= new BMW();
		
		System.out.println(b1.make);
		System.out.println(b2.make);
		
		b1.make="bmw2019";
		System.out.println(b1.make);
		System.out.println(b2.make);
		System.out.println(b1.model);
		
		b1.model="m3";
		
		b1.showPrice();
		
		
		b2.model="x3";
		
		b2.showPrice();
		
		
		

	}

}
