import java.util.Scanner;

public class RegEx {

    public static boolean isDayOfWeek(String string) {
        String regex = "(mon|tue|wed|thu|fri|sat|sun)";
        return string.matches(regex);
    }

    public static boolean allVowels(String string) {
        String regex = "[aeiou]+";
        return string.matches(regex);
    }

    public static boolean timeOfDay(String string) {
        String regex = "[0-2][0-9](:[0-5][0-9]){2}";
        return string.matches(regex);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String line = scanner.nextLine();
        System.out.println("isDayOfWeek: " + RegEx.isDayOfWeek(line));
        System.out.println("allVowels: " + RegEx.allVowels(line));
        System.out.println("timeOfDay: " + RegEx.timeOfDay(line));

        scanner.close();
    }
}
