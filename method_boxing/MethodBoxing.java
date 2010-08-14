

public class MethodBoxing {
	
	public static void main(String[] args) {
		long i = 9;
		
		Very v = new Very();
		
		System.out.println("boxed: " + v.drop(i));
	}
	
	public int boxed(Integer i) {
		return i;
	}
}

protected class Very {
	public long drop(long l) {
		return l + 10;
	}
}