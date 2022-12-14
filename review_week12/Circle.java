package review_week12;

public class Circle extends Shape{

	public double radius,diameter;
	public static final double PI;
	
	static {
		PI=Math.PI;
	}
	
	
	public Circle(double radius) {
		super("Circle");
		this.radius=radius;
		diameter=2*radius;
		area=calculateArea();
		perimeter=calculatePerimeter();
		
	}

	@Override
	public double calculateArea() {
		return radius*radius*PI;
	}

	@Override
	public double calculatePerimeter() {
		return diameter*PI;
	}
	
	
	
}
