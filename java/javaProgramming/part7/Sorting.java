import java.util.ArrayList;
import java.util.Arrays;

public class Sorting {

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int indexOfSmallestFrom = startIndex;

        for (int i = startIndex + 1; i < array.length; i++) {

            if (array[i] < array[indexOfSmallestFrom]) {
                indexOfSmallestFrom = i;
            }
        }

        return indexOfSmallestFrom;
    };

    public static void swap(int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    };

    public static void main(String[] args) {
        int[] numbers = { 5, 9, 2, 8, 3, 7, 4, 6, 1 };

        for (int i = 0; i < numbers.length; i++) {
            int indexOfSmallestFrom = Sorting.indexOfSmallestFrom(numbers, i);
            swap(numbers, i, indexOfSmallestFrom);
            System.out.println(Arrays.toString(numbers));
        }
    }
}