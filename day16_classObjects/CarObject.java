package day16_classObjects;

public class CarObject {

	public static void main(String[] args) {
		
		
		car car1=new car();
		
		car1.printCarInfo();
		
		car1.color="white";
		car1.currentSpeed=120;
		car1.make="honda";
		car1.model="civic";
		
		car1.printCarInfo();
	
		car1.showCurrentSpeed(115);
		car1.showCurrentSpeed(135);
		
		car1.drive();
		System.out.println("before "+ car1.currentSpeed);
		car1.accelerate(32);
		System.out.println("after "+ car1.currentSpeed);
		
		
	}

}
