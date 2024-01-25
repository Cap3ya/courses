import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {
        while (true) {
            System.out.print("Enter a command: ");
            String word = scanner.nextLine(); 
            if (word.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } 
            if (word.equals("add")) {
                
                System.out.print("Word: ");
                word = scanner.nextLine();
                
                System.out.print("Translation: ");
                String translation = scanner.nextLine();

                dictionary.add(word, translation);
            }
            else if (word.equals("search")) {
                System.out.print("To be translated: ");
                word = scanner.nextLine();

                System.out.println("Translation: " + dictionary.translate(word));
            } 
            else {
                System.out.println("Unknown command");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDictionary dictionary = new SimpleDictionary();

        TextUI ui = new TextUI(scanner, dictionary);
        ui.start();
        System.out.println(dictionary.translate("pike")); // prints the string "hauki"
    }
}
