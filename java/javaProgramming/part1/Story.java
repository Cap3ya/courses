import java.util.Scanner; 

public class Story {
	public static void main(String[] args) {
		// Create read input 
		Scanner scanner = new Scanner(System.in);
		// Print first instruction 
		System.out.println("I will tell you a story, but I need some information first.");
		System.out.println("What is the main character called?");
		// Read name input 
		String name = scanner.nextLine();
		// Print second instruction 
		System.out.println("What is their job?");
		// Read job input 
		String job = scanner.nextLine(); 
		
		// Print the story 
		System.out.println("Here is the story:");
		System.out.println("Once upon a time there was " + name + ", who was a " + job + "."); 
		System.out.println("On the way to work, " + name + " reflected on life.");
		System.out.println("Perhaps " + name + " will not be a " + job + " forever.");
	} 
}
