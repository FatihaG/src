package day41_abstraction;

public class Dog extends Animal{

	public Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
	System.out.println("dog is eating dog food");
		
	}

	@Override
	public void breathe() {
		System.out.println("dog is breathing");		
	}

}
