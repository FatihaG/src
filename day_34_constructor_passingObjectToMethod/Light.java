package day_34_constructor_passingObjectToMethod;

public class Light {
	
	
	int numOfWatts;
	boolean indicator;
	String location;
	
	public Light() {
		this(0,false);// this (); calling costructor
		System.out.println("returning from no_argument constructor no:1");
	}
	public Light (int watt,boolean ind) {
		this(watt,ind,"x");
	System.out.println("returning from constructor no:2");

}
	public Light(int numOfWatts, boolean indicator, String location) {
		
		this.numOfWatts = numOfWatts;
		this.indicator = indicator;
		this.location = location;
		System.out.println("return from constructor no:3");
	}
}