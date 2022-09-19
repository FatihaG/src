package day17_classObjects_part2;

public class BMW {
	
	String make="BMW";  //EKLEDIGIN HER OBJECT BMW OLCAK DEMEK!
	String model;
	double price;
	
	public void showPrice() {
		
		switch(model) {
		case "330i":
			price=40250;
			break;
		case "740i":
			price=85000;
			break;
		case "m3":
			price=65000;
			break;
		default:
			System.out.println(model +" is not avaliable");
			price=0.0;
		}
		
		System.out.println("price: "+ price);
	}
	

}
