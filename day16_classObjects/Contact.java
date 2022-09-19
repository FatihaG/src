package day16_classObjects;

public class Contact {
	
	String name;
	String phoneNumber;
	String email;
	
	
	public void call() {
		System.out.println("calling..."+ name);
	}
	
	public void sendMessage() {
		System.out.println("sending message..."+ phoneNumber+ " | name: "+ name);
	}

	public void sendEmail() {
		System.out.println("sending email..."+ email);
	}
	
}
