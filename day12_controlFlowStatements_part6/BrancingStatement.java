package day12_controlFlowStatements_part6;

public class BrancingStatement {

	public static void main(String[] args) {
		
		int number=0;
		
		while (number <15) {
			number++;
			if (number<=5) {
				System.out.println("Skipping number "+ number);
				continue;
			}
			System.out.println("number = "+ number);
			if (number>=10) {
				System.out.println("breaking at "+ number);
				break;
			}
		}

	}

}
