package day44_oop_review.callCenter;

public class CallCenter {

	public static void main(String[] args) {

		WhatsApp wa= new WhatsApp();
		
		wa.launch();
		wa.allOSCompatible=true;
		wa.Isfree=true;
		wa.name="whatsApp";
		wa.call("ozzy");
		wa.sendMessage("Thank you");
		wa.videoCall();
		wa.accept();
		
		VoiceCallable.decline();
		System.out.println(VoiceCallable.CAN_CALL);
		
		wa.getCount();
		wa.setCount(4);
		
		System.out.println("-------");
		
		VoiceCallable obj=new WhatsApp();//polymorphic way
		
		//obj.launch();//go to VoiceCallable , find launch method and run it
		
		((MessagingApp)obj).launch();
		((MessagingApp)obj).allOSCompatible=false;
		obj.call("mr tom");//overriding
		((VideoCallable)obj).videoCall();
		((WhatsApp)obj).videoCall();
		
		
		
		
		
		
		
	}

}
