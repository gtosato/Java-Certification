// Filename: Client.java
public class Client {

	public static void main(String[] args) {
		
		// Create a stack
		CharStack stack = new CharStack(40);
		
		// Create a string to push on the stack
		String str = "!no tis ot nuf era skcatS";
		int length = str.length();
		System.out.println("Original string: " + str);
		
		// Push the string char by char onto the stack
		for (int i = 0; i < length; i++) {
			stack.push(str.charAt(i));
		}
		
		System.out.print("Reversed string: ");
		
		// Pop and print each char from the stack
		while (!stack.isEmpty()) { // Check if the stack is not empty
			System.out.print(stack.pop());
		}
		System.out.print("\n\n");
		
		//-------------------- Programming Exercise 1.1 -------------------- //
		// Create a second stack using CharStack subclass PrintableCharStack //
		
		PrintableCharStack stack2 = new PrintableCharStack(40);
		
		// Push the string char by char onto the stack
		for (int i = 0; i < length; i++) {
			stack2.push(str.charAt(i));
		}		

		System.out.println("Original string: ");
		stack2.printStackElements();

		System.out.print("Reversed string: ");

		// Pop and print each char from the stack
		while (!stack2.isEmpty()) { // Check if the stack is not empty
			System.out.print(stack2.pop());
		}
		
		System.out.println();
	}

}
