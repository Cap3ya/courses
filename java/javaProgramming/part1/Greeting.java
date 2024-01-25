import java.util.Scanner; 

public class Greeting {
	public static void main(String[] args) {
		// Create a read input 
		Scanner scanner = new Scanner(System.in);
		// Print instruction
		System.out.println("Enter your name:");
		// Read input 
		String name = scanner.nextLine();
		// Print greetings
		System.out.println("Hi " + name);
	}
}
