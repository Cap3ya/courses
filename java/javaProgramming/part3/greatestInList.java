import java.util.Scanner;
import java.util.ArrayList;

public class greatestInList {
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
        int indexOfMax = 0;
        for (int i = 1; i < numlist.size(); i++) {
            if (numlist.get(i) > numlist.get(indexOfMax)) {
                indexOfMax = i;
            }
        }
        System.out.println("Biggest number: " + numlist.get(indexOfMax));
        System.out.println("Found at index: " + indexOfMax);
    }
}