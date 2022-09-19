package review.week6;

public class SubstringPractice {

	public static void main(String[] args) {
	
		String str ="EU4 is Awesome!";
		//check if there is more than one word

		/**int count=0;
		
		for(int i=0;i<str.length();i++) {
			if (i==1) {
				count++;
			}
		}
		if (count>0) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		*/
		
		System.out.println(str+ " has more than one word??: "+ str.contains(" "));
		System.out.println(str+ " has more than one word??: "+ (str.indexOf(" ")!=-1) );
		
		
		// find out the first word
		String firstWord=str.substring(0,str.indexOf(" "));
		System.out.println(firstWord);
		
		int firstSpaceIndex= str.indexOf(" ");
		
		
		System.out.println("space index if we start looking from index4-->"
							+ str.indexOf(" ",4));
		
		int secondSpaceIndex=str.indexOf(" ",firstSpaceIndex+1);
		System.out.println("space index if we start looking from index right after first space-->"
				+secondSpaceIndex);
		String secondWord=str.substring(firstSpaceIndex, secondSpaceIndex);
		System.out.println("second word is: "+secondWord);
		
	}

}
