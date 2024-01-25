import java.util.ArrayList;

public class Items {
    private ArrayList<String> listOfItems;

    public Items() {
        this.listOfItems = new ArrayList<>();
    }

    public void add(String item) {
        this.listOfItems.add(item);
    }

    public String toString() {
        return this.listOfItems.toString();
    }
}
