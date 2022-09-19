package review_week7;

public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countWord("java,javascript java and css java and datebase java","java"));
	}

	public static int countWord(String str, String word) {
		int count=0;
		
		while (str.contains(word)) {
			count++;
			str=str.replaceFirst("java", "");
		}
		return count;
	}
	
	
	
}
