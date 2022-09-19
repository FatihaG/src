package review_week3;

public class SwitchPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int seasonCode=1;//1,2,3,4
		//1:spring 2:summer 3:fall 4:winter
		/*if (seasonCode==1) {
		System.out.println("Spring");
		}else if (seasonCode==2) {
			System.out.println("Summer");
		}else if (seasonCode==3) {
			System.out.println("Fall");
		}else if (seasonCode==4) {
			System.out.println("Winter");
		}else {
			System.out.println("Not valid season!");
		}*/
		switch(seasonCode) {
		case 1:
			System.out.println("Spring");
			break;
		case 2:
			System.out.println("Summer");
			break;
		case 3:
			System.out.println("Fall");
			break;
		case 4:
			System.out.println("Winter");
			break;
		default:
			System.out.println("INVALID ENTRY");
		}
	}

}
