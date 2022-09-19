package day33_classObject_constrctors;

public class Task {

	String name;
	int age;
	String gender;
	int year;
	String course;
	String universty="Cybertek";//sabitlemis oluyorum
	
	
	
	
	
	public Task(String name, int age, String gender, int year, String course) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.year = year;
		this.course = course;
	}
	public void attendLecture() {
		System.out.println(name+ " is attending lecture");
	}
	public void submitAssignment() {
		System.out.println(name+ " is submitting assignment");
	}
	public void attendLab() {
		System.out.println(name+ " is attending lab");
	}
	
	
}
