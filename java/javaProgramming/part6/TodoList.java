import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> list;

    public TodoList() {
        this.list = new ArrayList<>();
    }

    public void add(String task) {
        this.list.add(task);
    }

    public void print() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i+1 +": " + list.get(i));
        }
    }

    public void remove(int number) {
        this.list.remove(number - 1);
    }

    public static void main(String[] args) {
        TodoList list = new TodoList();
        list.add("read the course material");
        list.add("watch the latest fool us");
        list.add("take it easy");
        list.print();
        list.remove(2);
        list.print();
        list.add("buy raisins");
        list.print();
        list.remove(1);
        list.remove(1);
        list.print();
    }
}