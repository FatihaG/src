package day21;

public class String_Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sentence = "Java String Manipulation is fun!";		
		
				System.out.println(sentence.substring(2));
		        System.out.println(sentence.substring(5, 11));
		       
		        System.out.println(sentence.substring(5, sentence.length()-5));
		        
		        
		        
		        String chars= "{{}}";
		        String word= "AUTOMATION";
		        
		        String result=chars.substring(0,2).concat(word).concat(chars.substring(2));
	      System.out.println(result);
	      
	      System.out.println(word.toLowerCase());
	      
	      
	      String str=" 342 ";
	
	      System.out.println("|"+str.trim()+"|");
	      
	      
	}
	

}
