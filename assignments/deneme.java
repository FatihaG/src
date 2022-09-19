
		package assignments;

public class deneme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int n=4;
		int m=n;
		for(int a=1;a<=n;a++) {
			
			for (int x=1;x<a;x++) {
				System.out.print(" ");}
			for (int c=m;c>=1;c--) {
				System.out.print(c+" ");
			
			}
				System.out.println();
				m--;
				
		}*/
		
		
		int counter=4;
		outer:
			for(int i=0;i<4;i++) {
		middle:
			for (int j=0;j<4;j++) {
				inner:
					for (int k=0;k<4;k++) {
						if (k-j>0) {
							break middle;
						}
						counter++;
					}
			}
		
	}
		
	System.out.println(counter);	
		
	}

}
