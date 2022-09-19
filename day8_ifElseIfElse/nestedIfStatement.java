package day8_ifElseIfElse;

public class nestedIfStatement {

	public static void main(String[] args) {
		
		boolean rushHour=false;
		int carType=1;
		double price=0.0;
		
		if(carType==1) {
			if(rushHour){
				price=30.30;
			}else {
				price=5.00;
			}			
		}else if (carType==2) {
			if (rushHour) {
				price=55.30;
			}else {
				price=15.99;
			}
			
			
		}
        System.out.println("total cost: "+price);
	}

}
