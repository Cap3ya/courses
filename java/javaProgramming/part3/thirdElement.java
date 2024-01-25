import java.util.Scanner;
import java.util.ArrayList;

public class thirdElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> wordlist = new ArrayList<>();
        int count = 0;

        System.out.println("Give word, Enter. Leave empty to stop.");
        while (true) {
            String word = scanner.nextLine();
            if (word == "") {
                break;
            }
            wordlist.add(word);
            count++;
        }
        if (count == 0) {
            System.out.println("Nothing in here !");
        } else if (count < 3) { // Print last
            System.out.println(wordlist.get(count-1));
        } else { // Print third
            System.out.println(wordlist.get(2));
        }
    }
}
