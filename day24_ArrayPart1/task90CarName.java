package day24_ArrayPart1;

public class task90CarName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] carName= {"Honda","Audi","Toyota","BMW","Mercedes","Nissan"};
		
		boolean flag=false;
		
		for(int i=0;i<carName.length;i++) {
			
			if (carName[i].equals("Honda")) {
				flag=true;
				break;
			}
		}
		
		if (flag) {
		System.out.println("I found your car Honda in this array");
		}else {
			System.out.println("not found it");
		}
		
		
		
	}

}
