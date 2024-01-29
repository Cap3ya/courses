import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BirdWatcher birdWatcher = new BirdWatcher();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Commands:" +
                "\nadd - add a new bird" +
                "\nobs - add a new observation" +
                "\nall - print all birds" +
                "\none - print one bird" +
                "\nstp - stop the program");

        while (true) {

            System.out.print("\nCommand: ");
            String command = scanner.nextLine();

            if (command.equals("add")) {

                System.out.print("Name: ");
                String name = scanner.nextLine();

                if (birdWatcher.hasBird(name)) {

                    System.out.println("ERROR: Bird already exist!");

                } else {

                    System.out.print("latinName: ");
                    String latinName = scanner.nextLine();
                    birdWatcher.add(new Bird(name, latinName));

                }
            } else if (command.equals("obs")) {

                System.out.print("name: ");
                String obsName = scanner.nextLine();
                birdWatcher.obs(obsName);

            } else if (command.equals("all")) {

                birdWatcher.all();

            } else if (command.equals("one")) {

                System.out.print("\nname: ");
                String oneName = scanner.nextLine();
                birdWatcher.one(oneName);

            } else if (command.equals("stp")) {

                break;

            } else {

                System.out.print(command + "does not exist");

            }
        }

        scanner.close();

    }
}