import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand> {
    
    private ArrayList<Card> hand;

    public Hand() {
        this.hand = new ArrayList<>();
    }

    public void add(Card card) {
        this.hand.add(card);
    }

    public void print() {
        for (Card card : hand) {
            System.out.println(card);
        }
    }

    public Integer sum() {
        return this.hand.stream().map(Card::getValue).reduce(0, (prev, curr) -> prev + curr);
    }

    public int compareTo(Hand hand) {
        if (this.sum() == hand.sum()) {
            return 0;
        }
        else if (this.sum() > hand.sum()) {
            return 1;
        }
        else {
            return -1;
        }
    }

    public void sortBySuit() {
        Collections.sort(hand, (c1, c2) -> c1.getSuit().ordinal() - c2.getSuit().ordinal());
    }
}
