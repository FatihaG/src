package review_week10;

public class StringPractice3 {

	public static void main(String[] args) {

		String str="aaaaabbbbbbcccccdddddcccccaaaaabbbbb";//"aabcca";
		//remove duplicated characters
		
		
		
		String result="";
		
		
		for(String each:str.split("")) {// array yapmis olduk
			if (!result.contains(each)) {
				result+=each;
			}  
		}
		System.out.println(result);
		
	}

}
