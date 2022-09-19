package day44_oop_review.shapes;



import static day44_oop_review.shapes.ShapeManager.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class ShapeActions {

	public static void main(String[] args) {

		
		Square mySquare = new Square();
		
		drawSquare(mySquare);// import ettik static method old. icin
		ShapeManager.drawSquare(mySquare);
		
		System.out.println("--------");
		
		String type="square";
		
		drawSquare((Square)buildShape(type));
		System.out.println("--------");
		
		Object obj= new Random();
		System.out.println(((Random)obj).nextInt(5));
		
		List<Shape> myList= new ArrayList<>();
		myList.add(new Shape());
		myList.add(new Triangle());
		myList.add(new Square());
		myList.add(new Shape());
		myList.add(new Triangle());
		
		drawShape(myList);
		
		
		
		
		
	}

}
