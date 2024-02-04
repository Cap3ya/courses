import java.util.ArrayList;

public class Changehistory {

    private ArrayList<Double> history;

    public Changehistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        this.history.add(status);
    }

    public void clear() {
        this.history.clear();
    }

    public String toString() {
        return this.history.toString();
    }

    public double maxValue() {
        if (!this.history.isEmpty()) {
            double maxValue = this.history.get(0);
            for (int i = 1; i < this.history.size(); i++) {
                if (maxValue < this.history.get(i)) {
                    maxValue = this.history.get(i);
                }
            }
            return maxValue; 
        }
        return 0;
    }

    public double minValue() {
        if (!this.history.isEmpty()) {
            double minValue = this.history.get(0);
            for (int i = 1; i < this.history.size(); i++) {
                if (this.history.get(i) < minValue) {
                    minValue = this.history.get(i);
                }
            }
            return minValue; 
        }
        return 0;
    }

    public double average() {
        if (!this.history.isEmpty()) {
            double sum = this.history.get(0);
            for (int i = 1; i < this.history.size(); i++) {
                    sum = sum + this.history.get(i);
            }
            return sum / this.history.size(); 
        }
        return 0;
    }
}
