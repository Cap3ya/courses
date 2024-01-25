import java.util.Scanner; 

public class secondsInDay {
    public static void main(String[] args) {
        int secondsPerDay = 86400; 
        // create read input 
        Scanner scanner = new Scanner(System.in);
        // print instruction
        System.out.println("How many days you would like to convert to seconds?");
        // read number, store as int 
        int numOfDay = Integer.valueOf(scanner.nextLine());
        // print days in seconds
        System.out.println(numOfDay * secondsPerDay);
    }
}