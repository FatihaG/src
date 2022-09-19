package day_34_constructor_passingObjectToMethod;

public class AppleTest {

	public static void main(String[] args) {
		Apple a1=new Apple();
		
		changeApple(a1);
		
		
				Apple a6=methodObject();
				Apple a7=new Apple();
				String str=methodObject().color;
				
				
	}

	
	public static void changeApple(Apple b1) { //Apple classini referans variable yaptik
		// chance the color inside the method
		
		b1.color="Yellow";
		b1.mA();
	}
	
	public static Apple methodObject() {
		return new Apple();
		
	}
}
