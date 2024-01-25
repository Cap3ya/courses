public class printNearly {
    public static void main(String[] args) {
        int[] array = { 5, 1, 3, 4, 2 };
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        int length = array.length;

        for (int i = 0; i < length; i++) {
            System.out.print(array[i]);

            if (i < length - 1) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }
    }
}
