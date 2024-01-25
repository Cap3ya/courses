import java.util.Scanner;
import java.nio.file.Paths;

public class GuestList {
    public static void main(String[] args) {
        // Variables
        Scanner readName = new Scanner(System.in);
        Scanner readFileName = new Scanner(System.in);
        String name, fileName, guestName;

        // file to read
        System.out.println("Name of the file: ");
        fileName = readFileName.nextLine();

        while (true) {
            boolean isGuestName = false;
            // read name
            System.out.println("Enter name, leave empty to quit");
            name = readName.nextLine();
            if (name.isEmpty()) {
                break;
            }
            try (Scanner readFile = new Scanner(Paths.get(fileName))) {
                while (readFile.hasNextLine()) {
                    guestName = readFile.nextLine();

                    if (guestName.equals(name)) {
                        isGuestName = true;
                        break;
                    }
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

            if (isGuestName) {
                System.out.println(name + " is on the list");
            } else {
                System.out.println(name + " is NOT on the list");
            }
        }
        readName.close();
        readFileName.close();
    }
}
