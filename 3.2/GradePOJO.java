
public class GradePOJO {

	private byte questionNo;
	private char subAnswer;
	private char corrAnswer;
	private Answer result;
	
	public byte getQuestionNo() {
		return this.questionNo;
	}
	
	public void setQuestionNo(byte questionNo) {
		this.questionNo = questionNo;
	}
	
	public char getSubAnswer() {
		return this.subAnswer;
	}
	
	public void setSubAnswer(char subAnswer) {
		this.subAnswer = subAnswer;
	}
	
	public char getCorrAnswer() {
		return this.corrAnswer;
	}
	
	public void setCorrAnswer(char corrAnswer) {
		this.corrAnswer = corrAnswer;
	}
	
	public Answer getResult() {
		return this.result;
	}
	
	public void setResult(Answer result) {
		this.result = result;
	}
}