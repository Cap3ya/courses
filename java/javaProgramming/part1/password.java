import java.util.Scanner; 

public class password {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in); 
        String input; String password = "password";
        
        System.out.println("Enter password:");
        input = scanner.nextLine();

        if (input.equals(password)) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }
    }
}