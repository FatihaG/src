package day13_methods_Part1;

public class Task65 {

	public static void main(String[] args) {
		 grades(100,100,100);
		 grades (50,50,50);

	}

	
	public static void grades (int g1,int g2,int g3) {
		int grades = (g1+g2+g3)/3;
		if (grades >=0 && grades<60) {
			System.out.println("F");
		}else if (grades >=60 && grades <70) {
			System.out.println("D");
		}else if (grades>=70&& grades <80) {
			System.out.println("c");
		}else if (grades >=80 && grades <90) {
			System.out.println("B");
		}else if (grades >=90 && grades<=100 ) {
			System.out.println("A");
		}
		
	}
}
