package day44_oop_review.shapes;

public class Square extends Shape{
	
	public Square() {
		type="Square";
		
	}

	public void draw() {
		System.out.println("draw a square");
	}
	
	public void squareMethod() {
		System.out.println("square method");
	}
}
