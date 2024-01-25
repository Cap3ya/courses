import java.util.Scanner;
import java.nio.file.Paths;

public class Words {
    public static void main(String[] args) {
        // Create reader to read file
        try ( Scanner scanner = new Scanner(Paths.get("data.txt")) ) {
            
            // read file until all lines have been read
            while (scanner.hasNextLine()) {
                // read line 
                String line = scanner.nextLine();
                // print line 
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        };
        
    }

}
