package review1_week_12;

public class CircleObject {

	public static void main(String[] args) {

		Circle c1=new Circle(5);
		
		System.out.println("Area: "+c1.getArea());
		
		System.out.println("primeter: "+c1.getPerimeter());		
		System.out.println("diameter"+c1.getDiameter());
		System.out.println(c1);
		
		Circle c2=new Circle(20);
		System.out.println(c2);
		
	}

}
