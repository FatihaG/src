package day44_oop_review.callCenter;

public class WhatsApp extends MessagingApp implements VideoCallable, VoiceCallable{

	@Override
	public void call(String contact) {
		System.out.println("whats App -caling "+ contact+ "...");
	}

	@Override
	public void videoCall() {
		System.out.println("whatsapp- doing a video call mr mike");
	}

	@Override
	public void sendMessage(String msg) {
		System.out.println("whats App - sending a message "+ msg +"...");
	}
	
	
	

}
