package day8_ifElseIfElse;

public class task34 {

	public static void main(String[] args) {
		
		int math=100;
		int chemistry=70;
		int biology=90;
		
		double av=(math+chemistry+biology)/3;
		System.out.println("avarage is "+ av );
		
		if (av<60) {
			System.out.println("grade is "+"F");
		}else if (av>=60 && av<70) {
			System.out.println("D");
		}else if (av>=70&&av<80) {
			System.out.println("C");
		}else if (av>=80&&av<90) {
			System.out.println("B");
		}else if (av>=90&&av<=100) {
			System.out.println("A");
		}else {
			System.out.println("invalid avarage");
		}
	}

}
