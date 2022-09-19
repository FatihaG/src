package day23_lab3_Random;

public class Question15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hasBad("badxx");
		hasBad("xbadxx");
		hasBad("xxbadxx");
	}

	
	public static void hasBad (String a) {
		
		boolean flag=true;
		
		
		for (int i=0;i<2;i++) {
			if(a.substring(i,i+3).equals("bad") ) {
				flag=true;
				break;
			}else {
				flag=false;
			}
		}
		if (flag) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}
}
