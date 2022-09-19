package yousef;

public class repl1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isError("three four error"));
		System.out.println(isError("error foo bar"));
	}
		
		public static boolean isError(String line) {
			String a;
			a=line.trim();
			if (a.substring(0, 5).equals("error")) {
				return true;
			}else {
				return false;
			}	
			
			
			
			
	}

}
