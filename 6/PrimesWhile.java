
import static java.lang.System.*;

public class PrimesWhile {
	
	public static void main(String[] args) {
		byte i = 0;
		while(i < 100) {	
			boolean prime = true;
			byte j = (byte)(i-1);
			
			while(prime && j>1) {
				if(i%j == 0) {
					prime = false;
				}
				j--;
			}
			
			if(prime) {
				out.print(i + " ");
			}
			
			++i;
		}
	}
	
}