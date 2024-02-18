import java.util.Random;

public class Dice {
    private Random random;
    private int numberOfFaces;

    public Dice(int numberOfFaces) {
        this.random = new Random();
        this.numberOfFaces = numberOfFaces;
    }

    public int throwDice() {
        return random.nextInt(this.numberOfFaces) + 1;
    }

    public static void main(String[] args) {
        Dice dice = new Dice(6);

        for (int i = 0; i < 10; i++) {
            System.out.println(dice.throwDice());
        }
    }
}
