import java.util.Scanner;

public class UserInterface {
    private Scanner scanner; 
    private WordSet wordset; 

    public UserInterface(Scanner scanner, WordSet wordset) {
        this.scanner = scanner; 
        this.wordset = wordset;;
    }

    public void start() {
        while (true) {
            System.out.print("Enter a word:");
            String word = scanner.nextLine(); 

            if (this.wordset.contains(word)) {
                break; 
            }

            this.wordset.add(word);
        }

        System.out.println("You gave the same word twice!");
        System.out.println(this.wordset.palindromes() + " of the words were palindromes.");

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WordSet set = new WordSet();

        UserInterface userInterface = new UserInterface(scanner, set);
        userInterface.start();

        scanner.close();
    }
}