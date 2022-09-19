package day8_ifElseIfElse;

public class switchCaseStatement {

	public static void main(String[] args) {
		
		String weather="sunny";
		
		switch (weather) {
		case "sunny":
			System.out.println("go to park");
			System.out.println("code java");
			break;
		case "hot":	
			System.out.println("go to swimming");
			System.out.println("code java");
			break;
		case "windy":
			System.out.println("fly a kite");
			System.out.println("code java");
			break;
		case "snow":
			System.out.println("make a snowman");
			System.out.println("code java");
			break;
		default :
		System.out.println("code java any other weather");
		
		}
	}

}
