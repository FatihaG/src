package day11_control_Flow_statement;

public class task53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num=0;
		int sumevennum=0;
		
		while (num<100) {
			if (num%2==0) {
				sumevennum=sumevennum+num;
				
		
		}num++;
		}
		
		System.out.println(sumevennum);
	}

}
