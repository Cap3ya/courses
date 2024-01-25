public class advancedAstrology {
    public static void main(String[] args) {
        printTriangle(10);
    }

    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
    }

    public static void printTriangle(int size) {
        for (int i = 1; i < size; i++) {
            printSpaces(size - i);
            printStars(i); printStars(i-1);
            System.out.println();
        }
            for (int i = 0; i < 2; i++) {
            printSpaces(size-2);
            printStars(3);
            System.out.println();
        }
    }

    public static void christmasTree(int height) {

    }
}