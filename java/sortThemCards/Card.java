public class Card {

    private int value;
    private Suit suit;

    public Card(int value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }

    @Override
    public String toString() {
        value = (value == 11) ? "Jack" : (value == 12) ? "Queen" : (value == 13) ? "King" : (value == 14) ? "As" : value;
        return suit + " " + value;
    }

    public Suit getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }
}
