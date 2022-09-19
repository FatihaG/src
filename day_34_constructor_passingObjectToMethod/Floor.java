package day_34_constructor_passingObjectToMethod;

public class Floor {
	
	double width;
	double length;
	



     public Floor(double width,double length) {
	 
    	 
    	 if (width<0) {
    		 this.width=0;
    	 }else {
    		 this.width=width;
    		 
    	 }
    	 if (length<0) {
    		 this.length=0;
    	 }else {
    	 this.length=length;
    	 
    	 }
 }

     public  double getArea() {
    	// this(width,length);
    	 double area=width*length;
    	 return area;
     }
     }