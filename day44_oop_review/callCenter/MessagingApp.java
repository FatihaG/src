package day44_oop_review.callCenter;

public abstract class MessagingApp {
	
	public String name;
	protected boolean Isfree;
	boolean allOSCompatible;
	private static int count;
	public static final String APP_TYPE="Messanger";
	
	
	public  MessagingApp() {
		System.out.println("messaging app no args constructor");
		
	}
	
	public MessagingApp(String name, int count) {
		this.name=name;
		this.count=count;
	}

	public abstract void sendMessage( String msg);
	
	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		MessagingApp.count = count;
	}

	public void launch() {
		System.out.println("messaging app is launching..");
	}
	
	public static void close() {
		System.out.println("messaging app is closing..");
	}
}
