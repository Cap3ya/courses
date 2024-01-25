import java.util.Scanner; 

public class squareRootOfSum {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        //read num1
        System.out.println("Give first num:");
        int num1 = Integer.valueOf(scanner.nextLine());
        //read num2
        System.out.println("Give second num:");
        int num2 = Integer.valueOf(scanner.nextLine());
        //print sqrt(sum) 
        int sum = num1 + num2;
        double squareRoot = Math.sqrt(sum);
        System.out.println("The square root of " + sum + " is " + (int) squareRoot);

    }
}