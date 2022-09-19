package day39_inheritance;

public class Car extends Vehicle{
	
	private int wheels;
	private int door;
	private int gears;
	private boolean isManual;
	private int currentGear;
	
	
	
	public Car(String name,String size,int wheels, int door, int gears, boolean isManual) {
		super(name,size);// my owner want me to run a constructornfrom parent class and which is no argument const
		this.wheels = wheels;
		this.door = door;
		this.gears = gears;
		this.isManual = isManual;
		this.currentGear=1;
	}
	
	public void changeGear(int currentGear) {
		this.currentGear=currentGear;
	}
	
	public void changeVelocity(int speed,int direction) {
		System.out.println("Car.changeVeloctiy():Veloctiy " + speed + " direction " + direction);
		super.move(speed,direction);//which move method?if i have here,i call this one,if not check parent class
	}
	
	@Override
	public void move(int velocity, int direction) {
		setCurrentVelocity(velocity+10);
		setCurrentDirection(direction + 10);
		System.out.println("Vehicle.move(): Moving at " + getCurrentVelocity() + " in direction " + getCurrentDirection() );
	}


}
