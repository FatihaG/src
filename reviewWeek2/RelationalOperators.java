package reviewWeek2;

public class RelationalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count=10;
		
		System.out.println(count==10);
		System.out.println(count!=10);
		
		if (count==10) {
			System.out.println("GREAT!");
		}else {
			System.out.println("NOT SO GREAT");
		}
		
		
		System.out.println("great = "+ (count==10));
		
		if (count%2==1) {
			System.out.println("this is an odd");
			
		}else {
			System.out.println("This is an even");
		}
		
		// check if the number divided by3 with no reminder
		
		if (count%3!=0) {
			System.out.println("it cannot be divided by 3 without reminder");
		}else {
			System.out.println("Can be divided by 3");
		}
		

	}

}
