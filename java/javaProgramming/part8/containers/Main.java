import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        Container container = new Container();

        System.out.println("Commands:" +
            "\nadd x - add x to c1" +
            "\nmove x - move x from c1 to c2" +
            "\nremove x - remove x from c2" + 
            "\nquit - quit the program");

        while (true) {

            System.out.println(container.toString()); 


            String command = scanner.nextLine();

            if (command.equals("quit")) {
                break;
            }

            String[] commands = command.split(" ");
            int amount = Integer.valueOf(commands[1]);
            command = commands[0];

            if (command.equals("add")) {
                container.add(amount);
            }
            else if (command.equals("move")) {
                container.move(amount);
            }
            else if (command.equals("remove")) {
                container.remove(amount);
            }

        }

    scanner.close();
    }
}