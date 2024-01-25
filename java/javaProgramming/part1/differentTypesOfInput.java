import java.util.Scanner; 

public class differentTypesOfInput {
	public static void main(String[] args) {
		// create read input 
		Scanner scanner = new Scanner(System.in);
		// print instruction
		System.out.println("Give a string:"); 
		// read myString, store as string 
		String myString = scanner.nextLine(); 
		// print instruction 
		System.out.println("Give an integer:");
		// read myInt, store as int 
		int myInteger = Integer.valueOf(scanner.nextLine());
		// print instruction 
		System.out.println("Give a double:");
		// read myDouble, store as double 
		double myDouble = Double.valueOf(scanner.nextLine());
		// print instruction 
		System.out.println("Give a boolean:");
		// read myBoolean, store as boolean
		boolean myBoolean = Boolean.valueOf(scanner.nextLine());
		// print myString
		System.out.println("You gave the string " + myString);
		// print myInt 
		System.out.println("You gave the integer " + myInteger);
		// print myDouble 
		System.out.println("You gave the double " + myDouble);
		// print myBoolean
		System.out.println("You gave the boolean " + myBoolean);
	}
}
