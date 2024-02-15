import java.util.Random;

public class Locker<T> {
    private T element; 

    public void setValue(T element) {
        this.element = element; 
    }

    public T getValue() {
        return this.element; 
    }

    public static void main(String[] args) {
        Locker<String> string = new Locker<>();
        string.setValue(":D");

        System.out.println(string.getValue());

        Locker<Integer> integer = new Locker<>(); 
        integer.setValue(123);

        System.out.println(integer.getValue());

        Locker<Random> random = new Locker<>(); 
        random.setValue(new Random());

        System.out.println(random.getValue());
    }
}