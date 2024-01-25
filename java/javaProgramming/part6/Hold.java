import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases; 

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>(); 
    }

    public void addSuitcase(Suitcase suitcase) {
        if (totalWeight() + suitcase.totalWeight() <= maxWeight) {
            suitcases.add(suitcase);   
        }
    }

    public int totalWeight() {
        int totalWeight = 0; 
        for (Suitcase suitcase : suitcases) {
            totalWeight += suitcase.totalWeight(); 
        };
        return totalWeight;  
    }

    public void printItems() {
        for (Suitcase suitcase : suitcases) {
            suitcase.printItems();
        }
    }

    public String toString() {
        if (suitcases.isEmpty()) {
            return "no suitcases";
        }
        String x = "suitcases";
        if (suitcases.size() == 1) {
            x = "item";
        }
        return suitcases.size() + " " + x + " (" + totalWeight() + " kg)";
    }
}
