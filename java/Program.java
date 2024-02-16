public class Program {

    public static int sum(int[] array, int from, int to, int smallest, int largest) {
        if (from < 0)
            from = 0;
        if (to > array.length)
            to = array.length;

        int sum = 0;
        for (int i = from; i < to; i++) {
            if (array[i] >= smallest && array[i] <= largest)
                sum += array[i];
        }
        
        return sum;
    }

    public static void main(String[] args) {
        int[] numbers = { 3, -1, 8, 4 };
        System.out.println(sum(numbers, 0, 0, 0, 0));
        System.out.println(sum(numbers, 0, 0, 0, 10));
        System.out.println(sum(numbers, 0, 1, 0, 10));
        System.out.println(sum(numbers, 0, 1, -10, 10));
        System.out.println(sum(numbers, -1, 999, -10, 10));
    }
}