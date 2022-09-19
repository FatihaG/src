package day_37Inheritance;

public class School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person=new Person();
		Student student=new Student();
		person.name="Mike";
		person.gender='M';
		person.age=35;
		
		
		student.name="Smith";
		student.age=23;
		student.gender='M';
		
		student.studentID=1000;
		 person.eat("steak");
		 student.eat("pizza");
		 
		
		
		
	}

}
