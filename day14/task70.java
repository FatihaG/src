package day14;

public class task70 {

	public static void main(String[] args) {
	//int x =calculateHighScorePosition(500);
		 //displayHighScorePosition("mike",x);
		displayHighScorePosition ("Ayse",1500);
		displayHighScorePosition ("fatma",400);
		displayHighScorePosition ("ali",900);
		displayHighScorePosition ("veli",50);
	}

	public static void displayHighScorePosition (String name,int position) {
		 int derece=calculateHighScorePosition(position);
		
		 System.out.println(name+" managed to get into position "+ derece +" on the high score table");
		
	}
	
	public static int calculateHighScorePosition(int score) {
		
		if (score>=1000) {
			return 1;
		}else if (score>=500&&score<1000) {
			return 2;
		}else if (score >=100&&score<=500) {
			return 3;
		}else {
			return 4;
		}
	}
	
}
