package review_week3;

public class StringEquality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String username="abc";
		String password="secretv";
		//correct usrname password is abcd and secret
		
		//if (username.equals("abcd") && password.equals("secret")) {
			//System.out.println("login succesful");
		//}else {
			//System.out.println("login not succesful!");
		//}

		
		/**
		 * 1.both username and pasword correct
		 * 2.both username and password wrond
		 * 3.username is correct but password is wrong
		 * 4.password is correct but username is wrong
		 */
		
		if (username.equals("abcd") && password.equals("secret")) {
			System.out.println("login succesful");
		}else if (!username.equals("abcd")&& !password.equals("secret")) {
		// 	else if (username.equals("abcd")==false&& !password.equals("secret")==false);
		
		System.out.println("Both username and password are wrong.");
		}else if(username.equals("abcd")&& !password.equals("secret")) {
			System.out.println("username is correct but password is wrong");
		}else if (!username.equals("abcd")&&password.equals("secret")) {
			System.out.println("password is correct but username is wrong");
		}
	
		
	}

}
