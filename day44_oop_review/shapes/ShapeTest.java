package day44_oop_review.shapes;

public class ShapeTest {

	
	public static void main (String []arg) {
		
		
		//create 4 shapes ,using polymorphic way
		
		
		Shape tr=new Triangle();
		
		Shape dia=new Diamond();
		
		Shape sq=new Square();
		
		Object shapeObj= new Shape();
		
		//Object abc=new Diamond();
		
		sq.draw();
		tr.draw();
		dia.draw();
		((Square)sq).squareMethod();
		//Downcasting :cast reference type to object type
		
		
		
		
		
		
		
		
	}
}
