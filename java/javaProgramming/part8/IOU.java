import java.util.HashMap;

public class IOU {

    private HashMap<String, Double> map;

    public IOU() {

        this.map = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {

        this.map.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {

        if (this.map.containsKey(toWhom))
            return this.map.get(toWhom);

        return 0;
    }

    public static void main(String[] args) {

        IOU mattsIOU = new IOU();
        mattsIOU.setSum("Arthur", 51.5);
        mattsIOU.setSum("Arthur", 10.5);

        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
    }
}