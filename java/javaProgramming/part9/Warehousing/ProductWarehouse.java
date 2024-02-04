public class ProductWarehouse extends Wharehouse {
    
    protected String productName; 

    public ProductWarehouse(String productName, double capacity) {
        super(capacity);
        this.productName = productName; 
    }

    public String getName() {
        return this.productName; 
    }
}
