import java.util.ArrayList;

public class Stack {
    private ArrayList<String> stack;

    public Stack() {
        this.stack = new ArrayList<>();
    }

    public boolean isEmpty() {
        return this.stack.isEmpty();
    }

    public void add(String value) {
        this.stack.add(value);
    }

    public ArrayList<String> values() {
        return this.stack; 
    }

    public String take() {
        String last = this.stack.getLast();
        this.stack.removeLast();
        return last;
    }
}
