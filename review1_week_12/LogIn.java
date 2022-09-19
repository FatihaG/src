package review1_week_12;

public class LogIn {

	public static void main(String[] args) {

		Credentials obj1=new Credentials();
		/*
		System.out.println("Username entered: "+obj1.userName);//private da not visible
		System.out.println("username entered: "+ obj1.passWord);
		System.out.println("==============");
		obj1.passWord="789456";     //public ken degistirebilirsin
		obj1.userName="B123456789";
		
		System.out.println("Username entered: "+obj1.userName);
		System.out.println("username entered: "+ obj1.passWord);
		*/
		
		
		System.out.println("Username entered: "+obj1.getUserName());
		System.out.println("Password entered:"+ obj1.getPassWord());
		
		obj1.setUserName("789456");
		obj1.setPassWord("B1234567");
		
		System.out.println("Username entered: "+obj1.getUserName());
		System.out.println("Password entered:"+ obj1.getPassWord());
		
		
		
		
	}

}
