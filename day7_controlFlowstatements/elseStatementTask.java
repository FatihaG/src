package day7_controlFlowstatements;

public class elseStatementTask {

	public static void main(String[] args) {
		//small tasks
		//1
		int y;
		int x=90;
		
		if (x>100) {y=20;
		
		}else {y=0;}
		System.out.println(y);

		//2
		
		int x1;
		int y1=110;
		
		if (y==100) {x1=1;
		System.out.println(x1);
		}else {x1=0;
		System.out.println(x1);}
		
		
		//3
		
		int a=11;
		int b=3;
		int c=7;
		
		if (a<10) {
			b=0;
			c=1;
			System.out.println(a+ " "+b+ " "+c);
			
		}else {
			b=-99;
			c=0;
			System.out.println(a+" "+b+" "+c);
		}
		
		
		//task29
		
		int a1=25;
		int a2=32;
		
		if (a1>a2) {
			System.out.println(a1 + "is greater than "+a2);
		}else {
			System.out.println(a2 +" is greater than "+a1 );
		}
		
		//task 30
		
		int f=31;
		int bolum=f%2;
		if (bolum==0) {
			System.out.println(f + " is even number");
		}else {
			System.out.println(f+ " is odd number ");
		}
		
		
		//task31
		
		int angle1=70;
		int angle2=38;
		int angle3=81;
		
		if (angle1+angle2+angle3==180) {
			System.out.println("valid triangle");
		}else {
			System.out.println("invalid triangle");
		}
		 
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
