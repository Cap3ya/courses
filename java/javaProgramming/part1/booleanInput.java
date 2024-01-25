import java.util.Scanner; 

public class booleanInput {
	public static void main(String[] args) {
		// create read input 
		Scanner scanner = new Scanner(System.in);
		// print instruction 
		System.out.println("Write a boolean:"); 
		// read bool, store as boolean
		boolean bool = Boolean.valueOf(scanner.nextLine());
		// print bool
		System.out.println("You wrote " + bool);
	}
}
