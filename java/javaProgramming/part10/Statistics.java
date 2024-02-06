import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Statistics {

    public static List<Integer> positive(List<Integer> numbers) {
        return numbers.stream()
        .filter(number -> number >= 0)
        .collect(Collectors.toCollection(ArrayList::new));
    } 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> inputs = new ArrayList<>(); 
    
        while (true) {
            String line = scanner.nextLine(); 
    
            if (line.equals("end")) {
                break;
            }

            if (!line.isEmpty())
                inputs.add(Integer.valueOf(line));
        }
    
        //Counting the number of value divisible by three
        long numDivByThree = inputs.stream()
        .mapToInt(input -> Integer.valueOf(input))
        .filter(number -> number % 3 == 0)
        .count();

        //Working out the average 
        double average = inputs.stream()
        .mapToInt(input -> Integer.valueOf(input))
        .average()
        .getAsDouble();

        System.out.println(
            "Numbers divisible by three: " + numDivByThree
            + "\nAverage: " + average
            + "\nPositive numbers: " + positive(inputs)
        );

        scanner.close();        
    }
}