import java.util.Scanner; 

public class Message {
	public static void main(String[] args) {
		// Create a tool for reading user input and name is scanner
		Scanner scanner = new Scanner(System.in);

		// Print "Write a message"
		System.out.println("Write a message:");
		// Read the string written by the user
		String message = scanner.nextLine();
		// Print the message written by the user
		System.out.println(message);
	}
}
