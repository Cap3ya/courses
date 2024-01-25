import java.util.Scanner;
import java.util.ArrayList;

public class secondPlusThird {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numlist = new ArrayList<>();
        int count = 0;

        System.out.println("Give number, Enter. Give 0 to stop.");
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 0) {
                break;
            }
            numlist.add(num);
            count++;
        }
        if (count == 0) {
            System.out.println("Nothing in here !");
        } else if (count < 2) { // Print first
            System.out.println(numlist.get(0));
        } else if (count < 3) { // Print first
            System.out.println(numlist.get(0) + numlist.get(1));
        } else { // Print sum 2nd + 3rd
            System.out.println(numlist.get(1) + numlist.get(2));
        }
    }
}
