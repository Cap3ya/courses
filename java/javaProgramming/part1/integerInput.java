import java.util.Scanner; 

public class integerInput {
	public static void main(String[] args) {
		// create read input 
		Scanner scanner = new Scanner(System.in);
		// print instruction 
		System.out.println("Give a number:");
		// read number, store as int 
		int number = Integer.valueOf(scanner.nextLine());
		// print number
		System.out.println("You gave the number " + number);
	} 
}
