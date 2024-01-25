import java.util.Scanner; 

public class comparingNumbers {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        //read num1
        System.out.println("Give first num:");
        int num1 = Integer.valueOf(scanner.nextLine());
        //read num2
        System.out.println("Give second num:");
        int num2 = Integer.valueOf(scanner.nextLine());
        //print comparison 
        boolean isEqual = num1 == num2; 
        boolean isGreater = num1 > num2;
        if (isEqual) {
            System.out.println(num1 + " is equal to " + num2);
        }
        else if (isGreater) {
            System.out.println(num1 + " is greater than " + num2);
        } else {
            System.out.println(num1 + " is smaller than " + num2);
        }
    }
}