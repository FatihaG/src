package reviewWeek5;

public class MethodWithReturnType {

	public static void main(String[] args) {
		
		String message= getMyMotto();
		
		System.out.println("my favorite motto is "+ message);
		
		//double f=81;
		//double c=(f-32)*5/9;
		
		//System.out.println(c);
		
		
		double tempInVA= fahrenheitToCelcius(54.9);
		System.out.println(tempInVA);
		
		System.out.println( fahrenheitToCelcius(81));
		System.out.println("bu kadar derece "+fahrenheitToCelcius(81));
		
		
	}
	
	
	public static double fahrenheitToCelcius(double f) {
		
		double c=(f-32)*5/9;
		return c;
		
	}
	// temperature converter F-->C 
	// C=(f-32)*5/9
	
    public static String getMyMotto() {
    	
    	
    	return "Happy wife happy life";
    	//System.out.println(""); NO WE CAN NOT! BECAUSE IT WILL BE UNREACHABLE!!
    	//RETURN keyword has 2 usage:
    		//return a value out of a method that return a value
    		//exit the method early (any methods including void method)		
    	
    }
}
