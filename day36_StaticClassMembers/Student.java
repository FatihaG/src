package day36_StaticClassMembers;

public class Student {

	String name;
	int age;
	int idNumber;//belongs to object
	static String School="Cybertek";//belongs to class
	
	
	
	public Student(String name, int age, int idNumber, String school) {
		super();
		this.name = name;
		this.age = age;
		this.idNumber = idNumber;
		School = school;
	}



	
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", idNumber=" + idNumber + ", School=" + School + "]";
	}
	
	
	
	
	
	
}
