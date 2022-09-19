package yousef;

public class andyDeneme {

	public static void main(String[] args) {
		
		 String text=("xjhskvxajsjkjjhhashlkjxkjhkajshkwlkjzxkjwjhkjhkjhkxjhkjhkx");
		
		 int count=0;
		int index=0;
		
		for(int i=0; i<text.length()-1; i++){
			
			if(text.charAt(i)=='x'){
			
			index=i;
			count++;
			  }
			
			if (count==4) {
				break;
				
			}
			}
			
			System.out.println(index);

	
	}
}
