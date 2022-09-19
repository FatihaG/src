package day8_ifElseIfElse;

public class task36Calculater {

	public static void main(String[] args) {
		
		int sayi1=7;
		int sayi2=2;
		String operator ="+";
		int result=0;
		
		switch (operator) {
		case "+":
			result= sayi1+sayi2;
			break;
		case "-":
			result= sayi1-sayi2;
			break;
		case "*":
			result=sayi1*sayi2;
			break;
		case "/":
			result=sayi1/sayi2;
			break;
		
		}
		
		System.out.println("result is "+ result);
	}

}
