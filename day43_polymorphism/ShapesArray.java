package day43_polymorphism;

import java.util.*;



public class ShapesArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Shape[] shapes =new Shape[3];
		
		shapes [0]=new Shape();
		
		shapes[1]=new Triangle();//polymorphic way
		
		shapes[2]=new Circle();
		
		
		
		for (Shape sh :shapes) {
			//System.out.println(sh.getClass().getName());
			System.out.println(sh.getClass().getSimpleName());
			//sh.draw();//do you know which class running from
		}
		

		ArrayList<Shape> shapeList= new ArrayList<>();
	//	List<Shape> shapeList= new ArrayList<>();//polymorphic way.. cunku arrayin interface i list
		 
		
		shapeList.add(new Triangle());
		shapeList.add(new Circle());
		
		
		
	}

}
