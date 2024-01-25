import java.util.Scanner; 

public class averageThreeNumbers {
    public static void main (String[] args) {
        int sum; int length = 3; 
        double average;  
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Give the first number:");
        int num1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int num2 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        int num3 = Integer.valueOf(scanner.nextLine());

        sum = num1 + num2 + num3;
        average = (double) sum / length; 

        System.out.println("The average is " + average);
        scanner.close();

    } 
}