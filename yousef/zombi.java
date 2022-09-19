package yousef;

import java.util.Scanner;

public class zombi {


			  public static void main(String[] args) {
			    Scanner scan = new Scanner(System.in);
			    int inhabitants = scan.nextInt();
			    int a=0;
			    
			    
			  //  while(inhabitants>=1){
			      
			    //   System.out.println("Day "+a+" ["+inhabitants+"]");
			      // a++;   
			       //inhabitants=inhabitants/2;
			    	   
			       
			    //}  
			  //System.out.println("-------EXTINCT-------");
			    
			    for(int i=inhabitants;i>=1;i/=2){
			     
			       System.out.println("Day "+a+" ["+i+"]");
			       a++;
			       if (i==1) {
			    	   break;
			       }
			    }
			  System.out.println("-------EXTINCT-------");
	   
	    
	}

}
