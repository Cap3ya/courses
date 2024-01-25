import java.util.ArrayList;

public class Suitcase {
    private int maxWeight;
    private ArrayList<Item> items;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        if (totalWeight() + item.getWeight() <= maxWeight) {
            items.add(item);
        }
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public int totalWeight() {
        int totalWeight = 0; 
        for (Item item : items) {
            totalWeight += item.getWeight(); 
        };
        return totalWeight;  
    }

    public Item heaviestItem() {
        Item heaviestItem = items.get(0); 
        for (int i = 1; i < items.size(); i++) {
            if (items.get(i).getWeight() > heaviestItem.getWeight()) {
                heaviestItem = items.get(i);
            }
        }
        return heaviestItem;
    }

    public String toString() {
        if (items.isEmpty()) {
            return "no items";
        }
        String x = "items";
        if (items.size() == 1) {
            x = "item";
        }
        return items.size() + " " + x + " (" + totalWeight() + " kg)";
    }
}
