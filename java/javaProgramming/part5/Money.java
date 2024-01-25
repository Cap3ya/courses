public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money addition) {
        int euros = this.euros + addition.euros;
        int cents = this.cents + addition.cents;
        return new Money(euros, cents);
    }

    public boolean lessThan(Money compared) {
        if (this.euros > compared.euros)
            return false;
        if (this.euros < compared.euros)
            return true;
        if (this.cents > compared.cents)
            return false; 
        if (this.cents < compared.cents)
            return true;
        return false; 
    }

    public Money minus(Money decreaser) {

        int euros = this.euros - decreaser.euros;
        if (euros < 0) 
            return new Money(0, 0);
            
        int cents = this.cents;
        for (int i = 0; i >= decreaser.cents; i++) {
            if (cents > 0) 
                cents = cents - 1; 
            else {
                euros = euros - 1; 
                cents = 99;
            }
        }

        return new Money(euros, cents);
    }
}
