package day24_ArrayPart1;

public class Arraysceations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//option 1:
		
		int [] numbers;
		numbers =new int [5];
		
		//option 2:
		
		int [] numbers1=new int [4];
		float [] temp=new float[100];
		char [] letters=new char [40];
		long []units=new long [35];
		String words[]=new String [5];
		
		int []scores=new int[5];
		scores[0]=80;
		scores[1]=85;
		scores[2]=90;
		scores[3]=100;
		scores[4]=50;
		
		System.out.println(scores[0]);
		System.out.println(scores[3]);
		System.out.println(scores[4]);
		
		int avgScore= (scores[0]+scores[1]+scores[2]+scores[3]+scores[4])/5;
		
		System.out.println(avgScore);
		
		
		
		
		
		
		
	}

}
