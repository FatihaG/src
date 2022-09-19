package review_week10;

public class StringPractice4 {

	public static void main(String[] args) {

		//frequency of word
		//"I love java, Java is cool,jAvA is fun"
		//"java"
		//3
		
		String sentence="I love java, Java is cool,jAvA is fun";
		String originalSentence=sentence;// orjinali tutmak icin
		sentence=sentence.toLowerCase(); //"I love java, Java is cool,jAvA is fun";
		                                 //"I love , Java is cool,jAvA is fun";
		String word="java";				//"I love ,  is cool,jAvA is fun";
		word=word.toLowerCase();		//"I love , is cool,is fun";
		
		int count=0;
		
		
		while (sentence.contains(word)) {
			sentence=sentence.replaceFirst(word,"");
			count++;
		}
		
		System.out.println(count);
		System.out.println(sentence);
	}

}
