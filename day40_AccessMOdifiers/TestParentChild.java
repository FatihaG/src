package day40_AccessMOdifiers;

public class TestParentChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child s=new Child();
		System.out.println("value of x before incremet"+ s.x);
		
		s.increment();
		
		System.out.println("value of x after increment"+s.x);
		
		
		Parent p=new Parent();
		System.out.println("value of x before increment"+p.x);
		
		p.increment();
		 System.out.println("value of x after inrement"+p.x);
		 
		
		
	}

}
