package repl;

import java.util.Scanner;

public class r160 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner scan = new Scanner(System.in);
		 /*   int size = scan.nextInt();
		    scan.nextLine();
		    String[] words = new String[size];
		    for(int i=0; i < size; i++){
		      words[i] = scan.next();
		      }
		   */ 
		String [] arr=new String [5];
		arr[1]="java";
		arr[2]="sati";
		arr[3]="fati";
		arr[4]="java";
		arr[0]="java";
		 
		    printUniqueWords(arr);
		  }
		  public static void printUniqueWords(String[] words){
		    //WRITE YOUR CODE HERE
		    int count =0;
		    String unique="";
		    for (int i=0;i<words.length;i++){
		    for(String each:words){
		    if (words[i].equals(each)){
		        count++;
		      }
		    }
		    if(count==1){
		      unique+=words[i];
		    }
		  }
		  System.out.println(unique);
		
	}

}
