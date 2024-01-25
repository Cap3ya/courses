import java.util.Scanner;

public class personalDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = ""; 
        int count = 0; int sum = 0; 

        System.out.println("Enter name,birthyears");

        while (true) {
            String input = scanner.nextLine();
            if (input.equals(""))
                break;
            
            String[] inputs = input.split(",");
            // Store the longest name 
            if (inputs[0].length() > name.length()) {
                name = inputs[0];
            } 
            // Average of the birth years
            sum += Integer.valueOf(inputs[1]);
            count++; 
        }
        double average = (double) sum / count; 
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + average);

    }
}
