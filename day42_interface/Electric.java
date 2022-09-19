package day42_interface;

public interface Electric {
	
	
	public static final boolean HAS_BATTERIES= true;
	//interface cannot instance or static block , you have to assing in the same line
	boolean HAS_BATTERIES2= false; //public static final yazmasan da
	
	public abstract void charge();
	
	
	void charge2();//public abstract yazmasan bile public diye
	
	public default void methodA() {
		//code
	}
	
	public static void methodB() {
		//code
	}
	
	// interface instance method olmaz
}
