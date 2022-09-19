package day41_abstraction;

public abstract class Animal {
	
	String name;
	
	public Animal (String name) {
		this.name=name;
	}
	
	public abstract void eat();//no body method abstract method
	
	public abstract void breathe();
	
	public void move () {  //instance method
		System.out.println("moving");
	}

}
