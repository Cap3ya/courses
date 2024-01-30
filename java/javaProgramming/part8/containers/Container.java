public class Container {

    private int amount1;
    private int amount2;
    private int minAmount;
    private int maxAmount;

    public Container() {
        this.amount1 = 0;
        this.amount2 = 0; 
        this.minAmount = 0;
        this.maxAmount = 100;
    }

    public boolean add(int addAmount) {
        if (this.amount1 + addAmount > this.maxAmount)
            return false;

        this.amount1 += addAmount;
        return true;
    }

    public boolean remove(int remAmount) {
        if (this.amount2 - remAmount < this.minAmount)
            return false;

        this.amount2 -= remAmount;
        return true;
    }

    public void move(int movAmount) {
        if (this.remove(movAmount) && this.add(movAmount)) {
            this.remove(movAmount);
            this.add(movAmount);
        }
    }

    public String toString() {
        return "C1: " + this.amount1 + "/" + this.maxAmount +
        "\n" + "C2: " + this.amount2 + "/" + this.maxAmount;
    }
}