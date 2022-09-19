package day41_abstraction;

public abstract class Bird extends Animal{

	/* @Override
	public void eat() {
		System.out.println("birds eating");
	} */

	public Bird(String name) {
		super(name);
		
	}

	@Override
	public void breathe() {
		System.out.println("bird is breathing");
	}
	
	public abstract void fly ();

}
