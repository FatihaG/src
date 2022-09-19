package day40_AccessModifiers_2;

import day40_AccessMOdifiers.Car;

public class CarTest {

	public static void main(String[] args) {

		Car c=new Car();
		
		
		//c.model="BMW" ayni package da degil default 
		c.year=2017;
		//c.door=4; private old.icin
		//c.engine=3.2; proetcted inherited degil
		
		
	}

}
