import java.util.Scanner; 

public class Conversation {
	public static void main(String[] args) {
		// Create read input 
		Scanner scanner = new Scanner(System.in);
		// Print first prompt
		System.out.println("Greetings! How are you doing?");
		// Read first answer
		String first = scanner.nextLine(); 
		// Print second prompt 
		System.out.println("Oh, how interesting. Tell me more!");
		// Reand second answer
		String second = scanner.nextLine();

	} 
}
