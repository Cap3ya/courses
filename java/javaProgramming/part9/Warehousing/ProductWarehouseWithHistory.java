public class ProductWarehouseWithHistory extends ProductWarehouse {

    private double initialBalance;
    private Changehistory history;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        super.balance = initialBalance;
        this.history = new Changehistory();
    }

    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.history.add(this.balance);
    }

    public void takeFromWarehouse(double amount) {
        super.takeFromWarehouse(amount);
        this.history.add(this.balance);
    }

    public String history() {
        return this.history.toString();
    }

    public void printAnalysis() {
        System.out.println(
            "Product: " + super.productName +
            "\nHistroy: " + this.history() + 
            "\nLargest amount of product: " + this.history.maxValue() +
            "\nSmallest amount of product: " + this.history.minValue() + 
            "\nAverage: " + this.history.average()
        );
    }
}
