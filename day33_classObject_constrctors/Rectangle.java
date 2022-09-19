package day33_classObject_constrctors;

public class Rectangle {
	double length;
	double width;
	public void getArea() {
		System.out.println(length*width);
	}

	//create constructor
	// with 2 double argument
	public Rectangle(double a,double b) {
		length=a;
		width=b;
	}
	
}
