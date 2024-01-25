import java.util.Scanner;
import java.nio.file.Paths;

public class Records {
    public static void main(String[] args) {
        // Variables 
        Scanner readFileName = new Scanner(System.in);
        String fileName, line, name, age; 

        System.out.println("Name of the file:");
        fileName = readFileName.nextLine();

        try (Scanner readFile = new Scanner(Paths.get(fileName))) {

            while (readFile.hasNextLine()) {
                // Read line 
                line = readFile.nextLine();

                if (line.isEmpty()) {
                    continue;
                }
                
                String[] lineSplit = line.split(",");
                name = lineSplit[0];
                age = lineSplit[1];

                System.out.println(name + ", age: " + age + "year");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        readFileName.close();
    }
}
