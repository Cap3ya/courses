import java.util.Scanner;

public class averageOfPositiveNumbers {
    public static void main(String[] args) {
        // read user input
        Scanner scanner = new Scanner(System.in);
        int count = 0, sum = 0;
        double average = 0;

        System.out.println(">> Average of positive numbers");
        System.out.println("usage: number + (Enter); 0 to exit");

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            } else if (number > 0) {
                sum = sum + number;
                count = count + 1;
            }
        }

        if (count == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            average = (double) sum / count;
            System.out.println("Average is " + average);
        }
    }
}