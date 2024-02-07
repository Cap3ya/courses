import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>(); 

        System.out.println(
            "Commands:\n"
            + "add - Add a new book\n"
            + "stop - Stop the program"
        );

        while (true) {

            System.out.print("command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }
            else if (command.equals("add")) {
                System.out.print("title: ");
                String title = scanner.nextLine();
                System.out.print("min age: ");
                int minAge = Integer.valueOf(scanner.nextLine());

                books.add(new Book(title, minAge));

            }
            else {
                System.out.println(
                    command + " is not a command"
                );
            }            
        }

        
        
        System.out.println(
            books.stream().count() + " books in total.\n"
            + "Books sorted by minAge:"
        );
        books.stream()
        .sorted( (b1, b2) -> b1.getMinAge() - b2.getMinAge())
        .forEach(book -> System.out.println(book));

        Comparator<Book> comparator = Comparator
            .comparing(Book::getMinAge)
            .thenComparing(Book::getTitle);

        Collections.sort(books, comparator);
        System.out.println("\nBooks sorted by minAge then by title");
        books.stream().forEach( book -> System.out.println(book));

        scanner.close();
    }
}