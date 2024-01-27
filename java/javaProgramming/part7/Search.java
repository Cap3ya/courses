public class Search {

    public static int linearSearch(int[] array, int searched) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searched) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] array, int searched) {
        int index = array.length / 2;
        for (int i = 0; i < array.length; i++) {
            if (array[index] == searched) {
                return index;
            } else if (array[index] < searched) {
                if ((index + index / 2) < array.length) {
                    index += index / 2;
                }
            } else if (array[index] > searched) {
                if ((index - index / 2) >= 0) {
                    index -= index / 2;
                }
            }
        }
        return -1;
    };

    public static void main(String[] args) {
        int[] numbers = { 0, 1, 2, 3, 4, 5 };
        System.out.println("Linear search 5: " + Search.linearSearch(numbers, 5));
        System.out.println("Linear search 6: " + Search.linearSearch(numbers, 6));

        System.out.println("Binary search 5: " + Search.binarySearch(numbers, 5));
        System.out.println("Binary search 6: " + Search.binarySearch(numbers, 6));
    };
}