package reviewWeek5;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		addNumbers(100);
		addNumbers(100, 200);
		addNumbers(100d, 200d);
		addNumbers(100, 200, 300);
		
		//byte b=100;
		//addNumbers(b);
		
		addNumbers((byte)100);
		
		
	}
	public static void addNumbers(byte num) {
		System.out.println("addNumbers(byte num) being called with"+ num);
	}
	
	
	  // addNumbers that has 1 int parameter : 
    // it will add 10 to the numbers provided and print 
  public static void addNumbers(int num) {
    
    System.out.println("the result is " + (num + 10) );
    
  }
  // addNumbers that has 2 int parameters: 
      // it will add these two numbers and print 
  public static void addNumbers(int num1, int num2) {
    
    System.out.println("the result is " + (num1 + num2) );
    
  }
  // addNumbers that has 2 i double parameters: 
  // it will add these two numbers and print 
  public static void addNumbers(double num1, double num2) {
    
    System.out.println("the result is " + (num1 + num2) );
    
  }
    
  // addNumbers that has 3 parameter : 
      // it will add these three numbers and print 
  public static void addNumbers(int num1, int num2, int num3) {
    
    System.out.println("the result is " + (num1 + num2 + num3) );
    
  }  
    
	
	
}
