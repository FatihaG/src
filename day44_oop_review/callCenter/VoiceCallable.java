package day44_oop_review.callCenter;

public interface VoiceCallable {

	boolean CAN_CALL=true;
	
	void call(String contact);
	
	public static void decline() {
		System.out.println("mike declined voice call");
		
	}
	
	public default void accept () {
		System.out.println("mike finally accepted voice call");
	}
	
	
	
}
