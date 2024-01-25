public class PaymentCard {
    private double balance; 

    public PaymentCard(double initialBalance) {
        this.balance = initialBalance; 
    }

    public void eatAffordably() {
        if (this.balance - 2.6 >= 0) this.balance -= 2.6;
    }

    public void eatHeartily() {
        if (this.balance - 4.6 >= 0) this.balance -= 4.6;
    }

    public void addMoney(double amount) {
        if (amount > 0) this.balance += amount; 
    }

    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }
}
