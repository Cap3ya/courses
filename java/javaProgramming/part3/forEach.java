import java.util.Scanner;
import java.util.ArrayList;

public class forEach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numlist = new ArrayList<>();

        System.out.println("Give num (-1 to quit), press Enter.");
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            if (num < 0) {
                break;
            }
            numlist.add(num);
        }
        int sum = 0;
        for (int num: numlist) {
            sum += num;
        }
        System.out.println("Sum: " + sum);
    }
}
