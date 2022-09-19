package day19_StringClass;

public class String_Concat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word="Java";
		System.out.println(word.concat("+selenium"));
		System.out.println(word.concat(" in eclipse"));
		System.out.println(word);
		
		word=word.concat("+Eclipse");
		
		System.out.println(word);
		
		word=word+123;
		System.out.println(word);
		
		word=word+true;
		System.out.println(word);
		
		String word2="Hi";
		word2=word2.concat("_hey").concat("-how are you").concat("-good");
		System.out.println(word2);
		
	}

}
