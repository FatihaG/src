package day_37Inheritance;

public class FinalExam extends GradeActivity{
	
	private int numQuestions;
	private double pointsEach;
	private int numMissed;


	public FinalExam(int numQuestions, int numMissed) {
		
		double numericScore;
		this.numQuestions=numQuestions;
		this.numMissed=numMissed;
		
		pointsEach=100.0/numQuestions;
		numericScore=100.0-(numMissed* pointsEach);
		
		// score=numericScore; private olmasaydi
		
		setScore(numericScore);
		
		
		
	}

}
