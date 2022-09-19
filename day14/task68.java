package day14;

public class task68 {

	public static void main(String[] args) {
	
		
		
		yearsUntilRetirement("fatiha",1980);
		

	}
	
	
	
	
	public static int calculateAge (int yearBirth) {
		
		
		return 2020-yearBirth;
		}
	
    public static void yearsUntilRetirement(String name,int year) {
		
		int retirementAge=65-calculateAge(year);
		 
		
		System.out.println(name+ " retires in "+retirementAge+" years" );
	
    }
	
}
