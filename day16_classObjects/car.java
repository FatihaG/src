package day16_classObjects;

public class car {

	String make;
	String color;
	String model;
	int currentSpeed;
	
	
	public void printCarInfo() {
		String info = "car make [" + make +"],model["+ model +"],color["+ color +"],current speed["+ currentSpeed+ "]";
		System.out.println(info);
	}
	
	
	public void showCurrentSpeed(int speedLimit) {
		if(currentSpeed<=speedLimit) {
	System.out.println(make+ " is driving at "+currentSpeed+ " mph,following the speed limit-"+speedLimit);
		}else {
			System.out.println(make+" is driving at "+ currentSpeed+ " mph,over the speed limit-"+speedLimit);
		}
	}
	
	public void drive() {
		System.out.println(make+" "+model + " is driving..");
	}
	
	public void accelerate (int mph) {
		currentSpeed=currentSpeed+mph;
		
	}
	
	
}



