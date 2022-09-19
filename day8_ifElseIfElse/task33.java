package day8_ifElseIfElse;

public class task33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int marks=90;
		
		if (marks<60) {
			System.out.println("fail");
		}else if (marks>=60 && marks<90){
			System.out.println("pass");
		}else if (marks>=90) {
			System.out.println("passed with distinction");
		}else {
			System.out.println("invalid score");
		}

	}

}
