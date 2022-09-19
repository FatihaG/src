package day5_unary_assignment_relation;

public class task18 {

	public static void main(String[] args) {
		int x=2;
		int y=x++;
		
		System.out.println(x);
		System.out.println(y);

		int i=2;
		System.out.println(i++);
	
	int s=2;
	System.out.println(--s);
	
	int w=8;
	 int z=w++;
	System.out.println(z);
	
	
	int a=50;
	int result=--a + a++ + a-- + a++;
	 
	// a in memory:50 - 49 - 50 - 49 - 50
	// result:     49 + 49 + 50 + 49
	
	int b=1;
	int res1= -b-- + b++ / -b-- *--b;
	
	System.out.println(b);
	System.out.println(res1); 
	
	
	
	System.out.println(result);
	System.out.println(a);
	
	//task21
	int g=4;
	int k= g*4-g++;
	 System.out.println(k );
	
	
	
	}
	

}
