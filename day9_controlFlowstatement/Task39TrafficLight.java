package day9_controlFlowstatement;

public class Task39TrafficLight {

	public static void main(String[] args) {
		
		char light= 'o';
		
		switch (light) {
		case 'R':
		case 'r':
			System.out.println("Red");
			break;
		case 'O':
		case 'o':
			System.out.println("Orange");
			break;
		case 'G':
		case 'g':
			System.out.println("Green");
			break;
		default :
			System.out.println("No light");
		}

	}

}
