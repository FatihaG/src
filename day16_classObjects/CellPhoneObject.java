package day16_classObjects;

public class CellPhoneObject {

	public static void main(String[] args) {
		
		CellPhone tel1= new CellPhone();
		
		tel1.brand="nokia";
		tel1.color="red";
		tel1.price=213.5;
		tel1.screenSize=23;
		
		
		System.out.println(tel1.brand);
		System.out.println(tel1.color);
		System.out.println(tel1.price);
		System.out.println(tel1.screenSize);
		
		tel1.color="black";
		System.out.println(tel1.color);
		
		CellPhone cell2=new CellPhone ();
		
		cell2.brand="siemens";
		cell2.color="silver";
		cell2.price=39.22;
		cell2.screenSize=1.5;
		
		System.out.println(cell2.brand);
		System.out.println("color "+ cell2.color);
		System.out.println("price "+ cell2.price);
		
		tel1.call();
		tel1.message();
		tel1.takeAphoto();
		
		cell2.call();
		cell2.takeAphoto();
		cell2.message();
		
		

	}

}
