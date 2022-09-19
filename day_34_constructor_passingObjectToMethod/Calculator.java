package day_34_constructor_passingObjectToMethod;

public class Calculator {
	
	Floor floor;
	Carpet carpet;
	
	  
	
	
	//getTotalCost(a);
			
	public Calculator(Floor floor, Carpet carpet) {
		this.floor=floor;
		this.carpet=carpet;
	//	getTotalCost();
		
		}

	
	public  double getTotalCost() {
		
			
	return carpet.getCost()*floor.getArea();
		
	}	
	}

