package review_week4;

public class LoopControlStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//break: breaking out of the loop early
		
		for(int i=1;i<=10;i++) {
			System.out.println(i+" ");
			if (i==5) {
				System.out.print("I'm gonna break right here");
				break;
			}
		}
		
		System.out.println();
		
		// continue:skip te current iteration
		
		for (int i=1;i<=10;i++) {
			if(i==5) {
				System.out.print("i will just skip this");
				continue;
			}
			System.out.print(i+" ");
		}
		
		
		System.out.println();
		
		for (int i=1;i<=10;i++) {
			if (i!=5) {
				System.out.print(i+" ");
			}else {
				System.out.print("i will just skip this");
			}
		}
		
	}

}
