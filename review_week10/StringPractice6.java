package review_week10;

public class StringPractice6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				//unique characteri bul
		
		String str="aababaaacbbdeggg";
		String uniques="";
		
		for (int i=0; i<=str.length()-1;i++) {   //for(char ch:str.toCharArray()){
			
		
		char ch=str.charAt(i);//a						bu line a gerek kalmaz  gerisi ayni
		int count=0;
		
		for (char each:str.toCharArray()) {
			if (each==ch) {
				count++;
			}
		}
		if (count==1) {
			uniques+=ch;
		}
		}
		
		System.out.println(uniques);
	}

}
