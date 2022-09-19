package day22_stringManipulation;

public class String_StartsEndsWith {

	public static void main(String[] args) {
		
		
		String word1="eclipse";
		
		System.out.println(word1.startsWith("e"));
		System.out.println(word1.startsWith("ec"));
		System.out.println(word1.startsWith("ex"));
		
		System.out.println(word1.endsWith("e"));
		System.out.println(word1.endsWith("ipse"));
		System.out.println(word1.endsWith("xe"));

		
		String name="Dr. Jackson";
		if (name.startsWith("Mr")) {
			System.out.println("maried man");
		}else if (name.startsWith("Mrs")){
			System.out.println("maried woman");
		}else if (name.startsWith("ms")) {
			System.out.println("some women");
		}else if (name.startsWith("Dr")) {
			System.out.println("Doctor man or woman");
		}else {
			System.out.println("Unknown status");
		}
		
		
		
		
		
	}

}
