import java.util.Scanner;

public class leapYear {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isLeap = false; 

        System.out.print("Give a year: ");
        int year = Integer.valueOf(scanner.nextLine());
      
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeap = true; 
                }
            } else {
                isLeap = true; 
            }
        }
        
        if (isLeap) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}