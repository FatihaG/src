package day12_controlFlowStatements_part6;

public class LabeledStatements {

	public static void main(String[] args) {
		
		int i=0;
		outer:
			do {
				i=8;
				inner:
					while (true) {
						System.out.println(i--);
						if (i==4) {
							break outer;
						}
					}
			}while (true);

	}

}
