package day43_polymorphism;

public class TesAnimal {

	public static void main(String[] args) {

		
		Animal a=new Animal();
		Animal b=new Dog();
		Animal c=new Bird();

		
		Animal animal= new Animal();
		animal= new Dog();
		animal=new Bird();
		
	//	Bird b=new Dog();// olmaz cunku bird dog'un parenti degil
		
	}

}


class Animal{}

class Dog extends Animal{}

class Bird extends Animal{}
