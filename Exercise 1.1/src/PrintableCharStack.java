// Filename: PrintableCharStack.java
public class PrintableCharStack extends CharStack {

	public PrintableCharStack(int capacity) {
		super(capacity);
		// TODO Auto-generated constructor stub
	}

	// Instance method
	public void printStackElements() {
		
		for (int i = 0; i <= topOfStack; i++) 
			System.out.print(stackArray[i]); // print each char on terminal

		System.out.println();
	}
}