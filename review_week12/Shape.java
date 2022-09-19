package review_week12;

import java.text.DecimalFormat;

public class Shape {

	public String name;
    public double area,perimeter;
    
    
    
    
    
    public Shape(String name) {
		
		this.name = name;
		
	}
    
    
    
	public double calculateArea() {
    	return 0;
    }
	 public double calculatePerimeter() {
		 return 0;
	 }
	 
	 
	@Override
	public String toString() {
		//DecimalFormat df=new DecimalFormat();
		return "Shape [name=" + name + ", area=" + area + ", perimeter=" + perimeter + "]";
	}
	
	 
	 
}
