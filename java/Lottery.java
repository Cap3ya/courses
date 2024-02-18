import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Lottery {

    private int[] lottery;

    public Lottery() {
        this.lottery = new int[7];
        this.randomizeNumbers();
    }

    public boolean containsNumber(int number) {
        for (int num : lottery) {
            if (num == number)
                return true; 
        }
        return false;
    }

    public void randomizeNumbers() {
        Random random = new Random(); 

        for (int i = 0; i < lottery.length ; i++) {
            lottery[i] = random.nextInt(47) + 1; 
        }
    }

    public String toString() {
        return Arrays.toString(this.lottery);
    }

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        System.out.println(lottery.toString());         
    }
}
