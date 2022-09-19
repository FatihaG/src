package day28_Lab4;

import java.util.Arrays;

public class Question__14 {

	public static void main(String[] args) {
     int[]x= {1,2,3};
     int[]y= {3,4,0};
     
     total(x,y);
	int[]x1= {2,3,4};
    int[]y1= {1,2};
    		 total(x1,y1);
    int[]x2= {1,2,3};
    int[]y2= {0,0};
    		total (x2,y2);
     }
     
	
	public static void total (int[]a,int[]b) {
		
		int[]c=new int[a.length+b.length];
		
		for (int i=0;i<a.length;i++) {
		 c[i]=a[i];	
		}
		int x=0;
		for (int j=a.length;j<c.length;j++) {
		c[j]=b[x];
		x++;
		
		}
			System.out.println(Arrays.toString(c));
		}
			
		
		
		
	
	
}
