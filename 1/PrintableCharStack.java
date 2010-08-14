
public class PrintableCharStack extends CharStack {

	//constructor
	public PrintableCharStack(int capacity) {
		super(capacity);
	}
	
	public void printStackElements() {
		for(int i=topOfStack; i >= 0; i--) {
			System.out.print(stackArray[i]);			
		}
		System.out.println();
	}
}