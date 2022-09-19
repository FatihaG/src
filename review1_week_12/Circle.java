package review1_week_12;

public class Circle {
	
	private  double radius,perimeter,area,diameter;
	public final static double PI=Math.PI;
	
	public Circle(double radius) {//for one time setting only for each object
		this.radius=radius;
		diameter=radius*2;
		area=calculateArea();
		perimeter=calculatePerimeter();
	}
	
	
	private double calculateArea() {//for internal use only
		return radius*radius*PI;
	}
	
	private double calculatePerimeter() {
		return diameter*PI;
	}


	
	public String toString() {
		return "Circle [radius=" + radius + ", diameter=" + diameter + ", area=" + area + ", perimeter=" + perimeter
				+ "]";
	}
	

	public double getPerimeter() {
		return perimeter;
	}


	


	public double getArea() {
		return area;
	}




	public double getDiameter() {
		return diameter;
	}


	

	public double getRadius() {
		return radius;
	}


	}
