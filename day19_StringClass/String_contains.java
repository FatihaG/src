package day19_StringClass;

public class String_contains {

	public static void main(String[] args) {
		
		String str="Hello mike to thr Cybertek School";
		boolean b=str.contains("Cyber");
		
		System.out.println(b);
		
		
		String email="test@gmail.com";
		System.out.println(email.contains("@"));
		
		
		String list="potatoes,tomatoes,eggs,milk,bread,cereal,meat,apples";
		
		if (list.contains("apples")) {
			System.out.println("Apples are in your list");
		}else {
			System.out.println("apples aren't in your list");
		}
		
		boolean hasEggs= list.contains("eggs");
				System.out.println("contains eggs: "+ hasEggs);
				
		boolean hasCucumbers=list.contains("cucumber");
		System.out.println("contains cucumber: "+ hasCucumbers);
		
		String etsyTittle="car | cat";
		if (etsyTittle.contains(" | ")) {
			System.out.println("pipe is there as expected");
		}else {
			System.out.println("pipe is not detected");
		}
		
		String searchItem="computer";
		String title="Amazon.com: computer";
		
		if (title.contains(searchItem)) {
			System.out.println("pass");
		}
		
		
	}

}
