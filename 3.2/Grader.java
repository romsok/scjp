
/**
*
*/
public class Grader {
	
	private static char[] answers ={'C','A','B','D','B','C','C','A'};

	public static void main(String[] args) {
	
		GradePOJO[] grades = new GradePOJO[8];
		
		byte right = 0;
		byte wrong = 0;
		byte unanswered = 0;
		
		for(byte i=0; i<args.length; i++) {
			GradePOJO grade = new GradePOJO();
			grade.setQuestionNo((byte)(i+1));
			grade.setSubAnswer(args[i].charAt(0));
			grade.setCorrAnswer(answers[i]);
			
			if(grade.getSubAnswer() == grade.getCorrAnswer()) {
				grade.setResult(Answer.RIGHT);
				right++;
			} else if(grade.getSubAnswer() == 'X') {
				grade.setResult(Answer.UNANSWERED);
				unanswered++;
			} else {
				grade.setResult(Answer.WRONG);
				wrong++;
			}
			
			grades[i] = grade;
		}
		
		boolean passed = (right >= 5) ? true : false;
		
		System.out.println("Question\tSubmitted Ans.\tCorrect Ans.\tResult");
		System.out.println("--------\t--------------\t------------\t------");
		for(GradePOJO grade : grades) {
		
			System.out.println("" + grade.getQuestionNo() + "\t" + grade.getSubAnswer() + "\t" + grade.getCorrAnswer() + "\t" + grade.getResult());
		}
		
		System.out.println("\nNo. of correct answers:\t" + right);
		System.out.println("\nNo. of wrong answers:\t" + wrong);
		System.out.println("\nNo. of unanswered answers:\t" + unanswered);
		
		if(passed) {
			System.out.println("The candidate has PASSED");
		} else {
			System.out.println("The candidate has FAILED");
		}
	}
}