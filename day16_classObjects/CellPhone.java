package day16_classObjects;

public class CellPhone {
	
	String brand;
	double screenSize;
	String color;
	double price;

	public void call(){
		
		System.out.println("Calling...");
	}
	
	public void message () {
		System.out.println("Sending txt message...");
		
	}
	
	public void takeAphoto() {
		System.out.println("taking a photo...");
		
	}
	
}
