package review1_week_12;

public class Test {
	
	public int score;
	
	public Test(int score) {
		this.score=score;
	}

	
	
	
	
}



class B{
	public static void main(String []args) {
		
		Test test01=new Test(10);
		//Test test02=new Test();eger parameter'li bi constructor atadiysan default kullanamzsin eger onu da yapmadiysan
		
		
		System.out.println(test01.score);
	}
}