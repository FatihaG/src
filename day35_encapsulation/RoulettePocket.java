package day35_encapsulation;

public class RoulettePocket {
	
	
	private int number;
	
	
	public RoulettePocket (int number) {
		
		this.number = number;
	}
		
	
		public void setNumber(int number) {
			if(number<0 || number >36) {
				this.number=999;
				}else {
			this.number = number;
		}
		}

	public int getNumber() {
		return number;
	}

	public String getColor() {
		
		if (number==0) {
			return "green";
		}
		if(number>0 &&number<=10) {
			if(number%2==0) {
				return "black";
			}else {
				return "red";
			}
		}
		if (number>=11&& number<=18) {
			if(number%2==0) {
				return "red";
			}else {
				return "black";
			}
		}
		if(number>=19&& number<=28) {
			if(number%2==0) {
				return "black";
			}else {
				return "red";
			}
		}
		if (number>=29&&number<=36) {
			if (number%2==0) {
				return "red";
			}else {
				return "black";
			}
		}else {
				return "invalid";
			}
		}
	
	
	
	
	
	

}
