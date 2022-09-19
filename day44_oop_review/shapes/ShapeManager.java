package day44_oop_review.shapes;

import java.util.List;

public class ShapeManager {
	

	
	public static Shape buildShape(String type) {
		
		Shape shape=null;
		
		switch(type.toLowerCase()) {
		
		case "shape":
			shape=new Shape();
			break;
		case "triangle":
			shape=new Triangle();
			break;
		case "square":
			shape=new Square();
			break;
			
				
		}
		return shape;
	}

	
	public static void drawSquare(Square squareObj) { //new object yapmis oluyoruz 
		
		
		squareObj.draw();
		
	}
	public static void drawShape(Shape shape) {
		System.out.println("Drawing a shape");
		shape.draw();
	}
	
	public static void drawShape(List<Shape> shapeList) {
		for (Shape each: shapeList) {
			each.draw();
		}
		
		
	}
	
	
	
	
	
}
