package day16_classObjects;

public class dogObjects {

	public static void main(String[] args) {
	
		Dog dog1=new Dog();
		
		Dog dog2=new Dog();
		
		Dog dog3=new Dog();		

		dog1.age=10;
		dog1.color="red";
		dog1.breed="maltese";
		dog1.name="rover";
		
		System.out.println(dog1.age);
		System.out.println(dog1.color);
		System.out.println(dog1.breed);
		
		dog1.barking();
		dog1.hungry();
		dog1.sleeping();
		
		
	}

}
