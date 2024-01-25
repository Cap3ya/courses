import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println(">> Your first account");

        Account account = new Account("owner", 100);
        account.deposit(20);
        System.out.println(account.balance());

        System.out.println(">> Your first bank transfer");

        Account matthewsAccount = new Account("matthews", 1000);
        Account myAccount = new Account("mySelf", 0);
        matthewsAccount.withdrawal(100);
        myAccount.deposit(100);
        System.out.println(matthewsAccount.balance());
        System.out.println(myAccount.balance());

        System.out.println(">> Person");

        Person pekka = new Person("Pekka");
        Person antti = new Person("Antti");

        int i = 0;
        while (i < 30) {
            pekka.growOlder();
            i = i + 1;
        }

        antti.growOlder();

        if (antti.isOfLegalAge()) {
            System.out.println(antti.getName() + " is of legal age");
        } else {
            System.out.println(antti.getName() + " is underage");
        }

        if (pekka.isOfLegalAge()) {
            System.out.println(pekka.getName() + " is of legal age");
        } else {
            System.out.println(pekka.getName() + " is underage ");
        }

        Person matti = new Person("Matti");
        Person juhana = new Person("Juhana");

        matti.setHeight(180);
        matti.setWeight(86);

        juhana.setHeight(175);
        juhana.setWeight(64);

        System.out.println(matti.getName() + ", body mass index is " + matti.bodyMassIndex());
        System.out.println(juhana.getName() + ", body mass index is " + juhana.bodyMassIndex());

        System.out.println(">> Whistle");

        Whistle duckWhistle = new Whistle("Kvaak");
        Whistle roosterWhistle = new Whistle("Peef");

        duckWhistle.sound();
        roosterWhistle.sound();
        duckWhistle.sound();

        System.out.println(">> Door");

        Door alexander = new Door();

        alexander.knock();
        alexander.knock();

        System.out.println(">> Product");

        Product banana = new Product("Banana", 1.1, 13);
        banana.printProduct();

        System.out.println(">> Decreasing counter");

        DecreasingCounter counter = new DecreasingCounter(10);

        counter.printValue();
        counter.decrement();
        counter.printValue();
        counter.reset();
        counter.printValue();
        counter.decrement();
        counter.printValue();

        System.out.println(">> Debt");

        Debt mortgage = new Debt(120000.0, 1.01);
        mortgage.printBalance();

        mortgage.waitOneYear();
        mortgage.printBalance();

        int years = 0;

        while (years < 20) {
            mortgage.waitOneYear();
            years = years + 1;
        }

        mortgage.printBalance();

        System.out.println(">> Song");

        Song garden = new Song("In The Garden", 10910);
        System.out.println("The song " + garden.name() + " has a length of " + garden.length() + " seconds.");

        System.out.println(">> Film");

        Film chipmunks = new Film("Alvin and the Chipmunks: The Squeakquel", 0);

        System.out.println("How old are you?");
        int age = Integer.valueOf(reader.nextLine());

        System.out.println();
        if (age >= chipmunks.ageRating()) {
            System.out.println("You may watch the film " + chipmunks.name());
        } else {
            System.out.println("You may not watch the film " + chipmunks.name());
        }

        System.out.println(">> Gauge");

        Gauge g = new Gauge();

        while (!g.full()) {
            System.out.println("Not full! Value: " + g.value());
            g.increase();
        }

        System.out.println("Full! Value: " + g.value());
        g.decrease();
        System.out.println("Not full! Value: " + g.value());

        System.out.println(">> Agent");

        Agent bond = new Agent("James", "Bond");

        bond.toString(); // prints nothing
        System.out.println(bond);

        Agent ionic = new Agent("Ionic", "Bond");
        System.out.println(ionic);

        System.out.println(">> Statistics");

        System.out.println("Give numbers, -1 to exit");

        Statistics stats = new Statistics();
        Statistics oddStats = new Statistics();
        Statistics evenStats = new Statistics();

        while (true) {
            int number = Integer.valueOf(reader.nextLine());
            if (number == -1) {
                break;
            }
            stats.addNumber(number);
            if (number % 2 == 0)
                evenStats.addNumber(number);
            else
                oddStats.addNumber(number);

        }

        System.out.println("Sum: " + stats.sum());
        System.out.println("Sum of even numbers: " + evenStats.sum());
        System.out.println("Sum of off numbers: " + oddStats.sum());

        System.out.println(">> Payment Card");

        PaymentCard paulCard = new PaymentCard(20);
        PaymentCard mattCard = new PaymentCard(30);
        paulCard.eatHeartily();
        mattCard.eatAffordably();
        System.out.println("Paul: " + paulCard);
        System.out.println("Matt: " + mattCard);
        paulCard.addMoney(20);
        mattCard.eatHeartily();
        System.out.println("Paul: " + paulCard);
        System.out.println("Matt: " + mattCard);
        paulCard.eatAffordably();
        paulCard.eatAffordably();
        mattCard.addMoney(50);
        System.out.println("Paul: " + paulCard);
        System.out.println("Matt: " + mattCard);

        System.out.println(">> Items");

        Items items = new Items();

        while (true) {
            String item = reader.nextLine();
            if (item.isEmpty()) break;
            items.add(item);
        }

        System.out.println(items);

        System.out.println(">> Books");

        System.out.println("usage: Book title, nb pages, pb year");
        System.out.println("emptry string to quit");

        ArrayList<NewBook> books = new ArrayList<>();

        while (true) {
            String book = reader.nextLine();
            if (book.isEmpty()) break;

            String[] parts = book.split(", ");
            String title = parts[0];
            int pages = Integer.valueOf(parts[1]);
            int year = Integer.valueOf(parts[2]);

            books.add(new NewBook(title, pages, year));
        }

        System.out.println("print 'everything' or 'name'");
        String option = reader.nextLine();

        if(option.equals("everything")) {
            for (NewBook book: books) {
                System.out.println(book);
            }
        } else {
            for (NewBook book: books) {
                System.out.println(book.getTitle());
            }
        }
        reader.close();
    }
}
