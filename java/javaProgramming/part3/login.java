import java.util.Scanner;

class login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] arrays = new String[][] {{"alex", "sunshine"}, {"emma","haskell"}};

        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        boolean isLoggedin = false; 
        for (String[] array: arrays) {
            isLoggedin = array[0].equals(username) && array[1].equals(password);
            if (isLoggedin) break; 
        }

        if (isLoggedin) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("incorrect username or password!");
        }
    }
}