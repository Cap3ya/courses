public class Wharehouse {

    protected double capacity;
    protected double balance; 

    public Wharehouse(double capacity) {
        this.capacity = capacity > 0 ? capacity : 0; 
        this.balance = 0;
    }

    public double getBalance() {
        return this.balance; 
    }

    public double getCapacity() {
        return this.capacity; 
    }

    public double howMuchSpaceLeft() {
        return this.capacity - this.balance; 
    }

    public void addToWarehouse(double amount) {
        if (amount > 0 && amount <= this.capacity) {
            this.balance += amount; 
        } else {
            System.out.println("ERROR: amout out of bounds");
        }
    }

    public void takeFromWarehouse(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance = this.balance - amount; 
        } else {
            System.out.println("ERROR: amout out of bounds");
        }
    }

    public String toString() {
        return "balance: " + this.balance + ", space left: " + this.howMuchSpaceLeft(); 
    }
}