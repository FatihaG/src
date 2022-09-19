package review_week12;

public class Square extends Shape{
	
	public double side;
	
	

	public Square(double side) {
		super("saquare");
		this.side = side;
		name="Square";
		area=calculateArea();
		perimeter=calculatePerimeter();
	}

	@Override
	public double calculateArea() {
		return side*side;
	}

	@Override
	public double calculatePerimeter() {
		return 4*side;
	}
	

	
}
