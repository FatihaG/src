package day42_interface;

public class ElectricCarTest {

	
	
	public static void main (String [] args) { 
	//ElectricCar ec= new ElectricCar (); //error - can not be instantiated
	
	
	Tesla modelS = new Tesla("Model S",45000,"Grey");
	
	
	 modelS.charge();
	 modelS.drive();
	 modelS.start();
	 modelS.stop();
	 
	 
	 
	 System.out.println("=================");
	 
	 Ford fusion =new Ford("Fusion",3500,"red",2017);
	 
	 fusion.charge();
	 fusion.drive();
	 fusion.start();
	 fusion.stop();
	 
	 
	 System.out.println("===========");
	 
	 TeslaSemi semi= new TeslaSemi ("Semi",50000,"brown",3.5);
	 
	 semi.charge();
	 semi.start();
	 semi.stop();
	 semi.drive();
	 semi.load("oranges");
	 
	 System.out.println("==============");
	 
	 TeslaTruck tr= new TeslaTruck("CybertekTruck",100000,"White",5.0);
	 
	 tr.charge();
	 tr.start();
	 tr.stop();
	 tr.drive();
	 tr.load("Java Books");
	 
	 System.out.println("==============");
	 
	 
	 System.out.println(modelS.toString());
	 System.out.println(semi.toString());
	 System.out.println(fusion.toString());
	 System.out.println(tr.toString());
	 
	 
	 
	 
	 
	 
	 
	}
	
}
