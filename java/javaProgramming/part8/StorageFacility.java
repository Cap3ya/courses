import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {

    private HashMap<String, ArrayList<String>> storage;

    public StorageFacility() {
        this.storage = new HashMap<>();
    }

    public void add(String key, String value) {
        this.storage.putIfAbsent(key, new ArrayList<>());

        ArrayList<String> values = this.storage.get(key);
        if (!values.contains(value)) {
            values.add(value);
        }
    }

    public ArrayList<String> contents(String key) {
        return this.storage.get(key);
    }

    public void remove(String key, String value) {
        if (this.storage.containsKey(key)) {
            ArrayList<String> values = this.storage.get(key);
            if (values.contains(value)) {
                values.remove(value);
            }
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> keys = new ArrayList<>(); 

        for (String key : this.storage.keySet()) {
            keys.add(key);
        }
        return keys ;
    }

    public static void main(String[] args) {
        StorageFacility facility = new StorageFacility();
        facility.add("a14", "ice skates");
        facility.add("a14", "ice hockey stick");
        facility.add("a14", "ice skates");
        
        facility.add("f156", "rollerblades");
        facility.add("f156", "rollerblades");
        
        facility.add("g63", "six");
        facility.add("g63", "pi");
        
        facility.remove("f156", "rollerblades");
        
        System.out.println(facility.contents("f156"));
        
        facility.remove("f156", "rollerblades");
        
        System.out.println(facility.storageUnits());
    }
}
