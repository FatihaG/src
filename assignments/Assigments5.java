package assignments;

public class Assigments5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("QUESTION 1");
		
		for (int a=0;a<=1000;a+=10) {
			System.out.print(a+",");
		}
		
		System.out.println();
		System.out.println("QUESTION 2");
		
		for (int b=3;b<=130;b++) {
			if (b%2==1) {
				System.out.print(b+"-");
			}
		}
		System.out.println();
		System.out.println("QUESTION 3");
		
		for(int c=5;c<=50;c++) {
			if (c%2==0) {
				System.out.print(c+"-");
			}
		}
		System.out.println();
		System.out.println("QUESTION 4");
		
		int d=8;
		d=d*10;
		while (d<100) {
			System.out.print(d+"-");
		  	d*=10;
		}
		System.out.println();
		System.out.println("QUESTION 5");
		int z=12;
		for (int e=1;e<=10;e++) {
			int f=z*e;
			System.out.println(z+"x"+e+"="+f);
		}
			
		System.out.println("QUESTION 6");
		
		
		
		
		System.out.println();
		System.out.println("QUESTION 7");
		
		for (int h=1;h<=100;h++) {
			if(h%5==0) {
				System.out.print(h+"-");
			}
		}

		
		System.out.println();
		System.out.println("QUESTION 8");
		
		int j=1;
		int k=20;
		int sumj=0;
		
		while (j<=k) {
		sumj=sumj+j;	
			j++;
		}
		System.out.println("Sum of the numbers till upper bound is: "+sumj);
		
		System.out.println("QUESTION 9");
		
		int end=41;
		int l=1;
		while (l<end-1) {
			if(l%2==1) {
				System.out.print(l+",");
			}l++;}
		for (l=end-1;l<=end;l++) {
			if (l%2==1)
				System.out.print(l);
		
		}
		
		System.out.println();
		System.out.println("QUESTION 10");
		
		for(int p=1;p<=7;p++) {
			for(int r=1;r<=p;r++) {
				System.out.print(p);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("QUESTION 11");
		
		
		
		System.out.println();
		System.out.println("QUESTION 12");
		
		for (int w=1;w<=10;w++) {
			for(int q=w;q<=w*10;q+=w) {
			System.out.print(q+" ");
			}System.out.println();
		}
		
		System.out.println();
		System.out.println("QUESTION 13");
		
		int row=8;
		int column=8;
		for (int x=1;x<=8;x++) {
			for (int v=1;v<=8;v++) {
				if (v%2==1&&x%2==1) {
					System.out.print("W"+" ");
				}else if (v%2==0&&x%2==1) {
					System.out.print("B"+" ");
					
				}else if (v%2==1&&x%2==0) {
					System.out.print("B"+" ");
				}else if (v%2==0&&x%2==0) {
					System.out.print("W"+" ");
				}
				
			}
			System.out.println();
			}
		
		System.out.println();
		System.out.println("QUESTION 14");
		
		for (int ab=1;ab<=7;ab++) {
			System.out.print("#");
			for (int ac=1;ac<ab;ac++) {
				
				System.out.print(" ");
				
			}System.out.print("#");
			System.out.println();
		}
		
		
		 
	}
	}

