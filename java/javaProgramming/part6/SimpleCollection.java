import java.util.ArrayList;

public class SimpleCollection {
    private ArrayList<String> collection;

    public SimpleCollection(String name) {
        this.collection = new ArrayList<>();
    }

    public void add(String letter) {
        this.collection.add(letter);
    }

    public String longest() {
        if (this.collection.isEmpty()) {
            return null;
        }

        int indexOfMax = 0; 
        for (int i = 1; i < collection.size(); i++) {
            if (collection.get(i).length() > collection.get(indexOfMax).length()) {
                indexOfMax = i;
            }
        }
        return collection.get(indexOfMax);
    }

    public String toString() {
        if (this.collection.isEmpty()) {
            return "The collection collection is empty";
        }
        String string = "";
        if (this.collection.size() == 1) {
            string = "The collection collection has 1 element:";
        } else {
            string = "The collection collection has " + this.collection.size() + " elements:";
        }
        for (String item : this.collection) {
            string += "\n" + item;
        }

        return string;
    }
}
