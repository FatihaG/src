package repl;

import java.util.Arrays;

public class r170 {
	
	public static void main ( String[] args) {
	
	

	int [] inhabitants= {3,6,0,4,3,2,7,0};
		
	
	System.out.println("Day 0 "+Arrays.toString(inhabitants));

	
	
	//while ()
	for(int j=0;j<inhabitants.length;j++) {
	for(int i=0;i<inhabitants.length-1;i++) {
		if (inhabitants[i]==0) {
			inhabitants[i-1]/=2;
			inhabitants[i+1]/=2;
		}}
		if (inhabitants[inhabitants.length-1]==0) {
			inhabitants[inhabitants.length-2]/=2;
		
		}
	
		
		System.out.println("Day "+(j+1)+" "+ Arrays.toString(inhabitants));
	//for(int i=inhabitants.length;i<=0;i/=2) {

	}
		
		
		
		
		
		
		
	
}
	
	
}
