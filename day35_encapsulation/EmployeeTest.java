package day35_encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Employee e1=new Employee();
		
		Employee e2=new Employee("Mark Jones",39119);
		
		Employee e3=new Employee("Tedd",81775,"sales","Sales person");
		
		
		System.out.println(e1.getName()+"|"+e1.getIdNumber()+"|"+e1.getDepartment()+"|"+e1.getPosition());
		System.out.println(e2.getName()+"|"+e2.getIdNumber()+"|"+e2.getDepartment()+"|"+e2.getPosition());
		System.out.println(e3.getName()+"|"+e3.getIdNumber()+"|"+e3.getDepartment()+"|"+e3.getPosition());

		e1.setName("mike");
		e1.setIdNumber(47666);
		e1.setDepartment("accounting");
		e1.setPosition("accounter");
		
		
		System.out.println(e1.getName()+"|"+e1.getIdNumber()+"|"+e1.getDepartment()+"|"+e1.getPosition());
		
		System.out.println(e2.toString());
	}

}
