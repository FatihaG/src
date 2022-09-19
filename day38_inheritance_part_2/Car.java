package day38_inheritance_part_2;

public class Car extends Vehicle {

  int maxSpeed=180;	
	
	public void display() {
		System.out.println("maximum speed: "+ super.maxSpeed);
		System.out.println("Maximum speed: "+ maxSpeed);
	}
	
}
