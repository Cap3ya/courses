import java.util.*;

public class LastNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        ArrayList<Person> persons = new ArrayList<>();

        while (true) {

            System.out.println(
                "\nContinue personal information input?\n" +
                "\"quit\" to end the program."
            );
            
            String line = scanner.nextLine();

            if (line.equals("quit")) {
                break; 
            }

            System.out.print("Input first name: ");
            String fName = scanner.nextLine().trim();

            System.out.print("Input last name: ");
            String lName = scanner.nextLine().trim();

            System.out.print("Input the year of birth: ");
            String bYear = scanner.nextLine().trim();

            persons.add(new Person(fName, lName, bYear));

        }

        System.out.println(
            "Unique last nmaes in alphabetical order:\n" +
            persons.stream()
            .map(person -> person.getLastName())
            .distinct() 
            .sorted()
            .reduce( "", (prev, curr) -> prev + curr + "\n")
        );

        scanner.close();
    }
}
