
/**
*The <em>main</em> class of the application.
*Pushes a backwards string onto the stack and prints it backwards.
*Utilizes <code>CharStack</code>
*@author romsok
*@version 1.0

*/

public class Client {

	/**
	*The main method of this class, duh!!
	*@param an array of <code>String</code> objects containing command line arguments
	*@return notin!!!!
	*/
	public static void main(String[] args){
	
		PrintableCharStack pcs = new PrintableCharStack(40);
		String str = "!no tis ot nuf era skcatS";
		
		int length = str.length();
		
		System.out.println("original string: " + str);
		
		for(int i=0; i<length; i++) {
			pcs.push(str.charAt(i));
		}
		
		System.out.print("reversed string: ");
		pcs.printStackElements();
	}
}