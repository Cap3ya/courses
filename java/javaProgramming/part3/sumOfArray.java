public class sumOfArray {
    public static void main(String[] args) {
        int[] numbers = { 5, 1, 3, 4, 2 };
        System.out.println( sumOfNumbersInArray(numbers) );
    }

    public static int sumOfNumbersInArray(int[] array) {
        int sum = 0; 
        for (int element: array) {
            sum += element; 
        }
        return sum;
    }

}
