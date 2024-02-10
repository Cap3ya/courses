public class Card {

    private int value;
    private Suit suit;

    public Card(int value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return suit + " " + (this.value == 11 ? "J" 
            : this.value == 12 ? "Q" 
            : this.value == 13 ? "K" 
            : this.value == 14 ? "A" 
            : String.valueOf(this.value));
    }

    public Suit getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }
}
