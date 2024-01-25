import java.util.Scanner;

public class sumOfTwoNumbers {
    public static void main(String[] args) {
        int sum; 
        // create read input
        Scanner scanner = new Scanner(System.in);
        // print instruction
        System.out.println("Give the first number:");
        // read first number 
        int num1 = Integer.valueOf(scanner.nextLine());
        // print instruction 
        System.out.println("Give the second number:");
        // read first number 
        int num2 = Integer.valueOf(scanner.nextLine());
        // print sum 
        sum = num1 + num2;
        System.out.println("The sum of the numbers is " + sum); 
    } 
}