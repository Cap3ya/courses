import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Container C1 = new Container();
        Container C2 = new Container();

        System.out.println("Commands:" +
            "\nadd x - add x to c1" +
            "\nmove x - move x from c1 to c2" +
            "\nremove x - remove x from c2" + 
            "\nquit - quit the program" + 
            "\n");

        while (true) {

            System.out.println(C1.toString() + "\n" 
                + C2.toString() + "\n");

            String command = scanner.nextLine();

            if (command.equals("quit"))
                break;

            String[] commands = command.split(" ");
            int amount = Integer.valueOf(commands[1]);
            command = commands[0];

            if (command.equals("add"))
                C1.add(amount);

            else if (command.equals("move"))
                Container.move(C1, C2, amount);

            else if (command.equals("remove")) 
                C2.remove(amount);
            else 
                System.out.println(command + " does not exist!");
        }
    scanner.close();
    }
}