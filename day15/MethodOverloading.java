package day15;

public class MethodOverloading {

	public static void main(String[] args) {
	
		
		sum ();
	    System.out.println(sum(4,9));
	    int x=sum(5,8,123);
		System.out.println(x);

	}

	
	
	
	public static void sum (){
		System.out.println("hello");
	}
	
	public static int sum (int a,int b){
	return a+b;	
	}
	
	public static int  sum (int a, int b,int c){
		return a+b+c;
	}
	
}
