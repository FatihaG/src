package day40_AccessMOdifiers;

public class CarTest {

	public static void main(String[] args) {

		
		Car c=new Car();
		
		c.model="M3";
		c.year=2017;
		//c.door=4;
		c.engine=3.2;
		
		
		System.out.println(c.toString());
	}

}
