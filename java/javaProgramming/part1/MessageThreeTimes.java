import java.util.Scanner;

public class MessageThreeTimes {

	public static void main(String[] args) {
		// Create a read input
		Scanner scanner = new Scanner(System.in);
		// Print instruction 
		System.out.println("Enter a message:");
		// Store & Read input
		String message = scanner.nextLine();
		// Print input 3 times
		for(int i = 0; i < 3; i++) {
			System.out.println(message);
		}
	}
}
