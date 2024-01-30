public class Container {

    private int quantity;
    private int maxQuantity;

    public Container() {
        this.quantity = 0;
        this.maxQuantity = 100;
    }

    public int add(int amount) {
        int maxAmount = this.maxQuantity - this.quantity;
        if (amount > maxAmount)
            amount = maxAmount;

        this.quantity += amount;
        return amount;
    }

    public int remove(int amount) {
        int maxAmount = this.quantity;
        if (amount > maxAmount)
            amount = maxAmount;

        this.quantity -= amount;
        return amount;
    }

    public String toString() {
        return this.quantity + "/" + this.maxQuantity;
    }

    static void move(Container C1, Container C2, int amount) {
        C2.add(C1.remove(amount));
    }
}