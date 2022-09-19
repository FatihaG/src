package day6_logicalOperators;

public class operatorPrecedence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int oranges=30;
		int apples=20;
		int pears=30;
		
		boolean comp=apples<oranges||oranges<pears;
		// t||-----=t
		
		System.out.println(comp);
		
		
		String outsideWeather; 
		int degree;
		outsideWeather="Shinny";
		degree=70;
		
		boolean comp2=(!(outsideWeather=="rainy"|| degree==70));
		// (!(f||t))--->!t--->F
		
		
		int b=2;
		boolean res =++b==2||--b==2&&--b==2;
		
		//b in memory 2 3 2 1 
		// res ; 3==2||2==2&&1==2 //f
		
		boolean x=true, z= true;
		int y =20;
		
		x=(y!=10)&&(z=false);// == degil sadece= reassingnment
		
		System.out.println(x);
		
		
		
		//task
		 double d1=20;
		 double d2=80;
		 
		 double res1=(d1=d2)*25;
		 double reminder= res1%40;
		 
		 System.out.println(reminder<=20);
		 
		 System.out.println(reminder);
		 
		
	}

}
