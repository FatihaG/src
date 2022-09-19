package review1_week_12;

public class Credentials {
	
	
	
	private String userName="A123456789";
	private String passWord="Cybertek123";
	

//	public static String setUsermane() { // datalar static degilse static yapamazsin public yapmalisin sadece
	//}
	
	public String getUserName() {
		return userName;
	}
	
	
	public String getPassWord() {
		return passWord;
	}
	
	
	public void setUserName(String userName) {
		this.userName=userName;//this.only used it to call the instace when local variable is sharing the same name
	}
	
	
	public void setPassWord(String passWord) {
		this.passWord=passWord;
	}
}
