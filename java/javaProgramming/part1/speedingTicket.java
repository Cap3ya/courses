import java.util.Scanner;

public class speedingTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int speed; int limit = 120;

        System.out.println("Give speed:");
        speed = Integer.valueOf(scanner.nextLine());

        if (speed > limit) {
            System.out.println("Speeding ticket!");
        }
    }
}