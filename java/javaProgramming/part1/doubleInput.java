import java.util.Scanner; 

public class doubleInput {
	public static void main(String[] args) {
		// create read input
		Scanner scanner = new Scanner(System.in);
		// print instruction 
		System.out.println("Give a number:");
		// read number, store as double 
		double number = Double.valueOf(scanner.nextLine());
		// print number 
		System.out.println("You gave the number " + number);
	}
}
