package day36_StaticClassMembers;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1=new Student("mike",30,1000,"Cybertek");
		Student s2=new Student("Ozzy", 20, 2000,"Cybertek");
		Student s3=new Student("jamal",10, 1500, "Cybertek");
		
		s1.School="CybertekEU";
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		
		
		
	}

}
