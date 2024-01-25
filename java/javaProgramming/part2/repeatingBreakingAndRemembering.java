import java.util.Scanner;

public class repeatingBreakingAndRemembering {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, sum = 0, count = 0, odd = 0, even = 0;
        double mean;

        while (true) {
            System.out.println("Write numbers:");
            num = Integer.valueOf(scanner.nextLine());

            if (num == -1) //to exit
                break;
            if (num % 2 == 0) //isEven
                even++;
            else
                odd++;

            sum += num; // sum numbers
            count++; // count numbers
        }

        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Count: " + count);
        mean = (double) sum / count;
        System.out.println("Mean: " + mean);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
