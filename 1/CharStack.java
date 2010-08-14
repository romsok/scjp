
public class CharStack {

	protected char[] stackArray;
	protected int topOfStack;
	
	//constructor
	public CharStack(int capacity) {
		stackArray = new char[capacity];
		topOfStack = -1;
	}
	
	//Instance methods
	public void push(char element) {
		stackArray[++topOfStack] = element;
	}
	
	public char pop() {
		return stackArray[topOfStack--];
	}
	
	public char peek() {
		return stackArray[topOfStack];
	}
	
	public boolean isEmpty() {
		return topOfStack < 0;
	}
	
	public boolean isFull() {
		return topOfStack == stackArray.length -1;
	}
}