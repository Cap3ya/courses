import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Warehouse {

    private HashMap<String, Integer> prices;
    private HashMap<String, Integer> stocks;

    public Warehouse() {
        this.prices = new HashMap<>();
        this.stocks = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.prices.put(product, price);
        this.stocks.put(product, stock);
    }

    public int price(String product) {
        return this.prices.containsKey(product) ? this.prices.get(product) : -99;
    }

    public int stock(String product) {
        return this.stocks.containsKey(product) ? this.stocks.get(product) : 0;
    }

    public boolean take(String product) {
        int stock = 0; 
        if (this.stocks.containsKey(product)) {
            stock = this.stocks.get(product);
            if (stock > 0) {
                this.stocks.put(product, stock - 1);
            }
        }
        return stock > 0;
    }

    public Set<String> products() {
        Set<String> products = new HashSet<>() {
        };
        for (String product : this.stocks.keySet()) {
            products.add(product); 
        }

        return products; 
    }
}