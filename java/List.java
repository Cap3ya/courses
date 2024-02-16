public class List<T> {
    private T[] values;
    private int firstFreeIndex;

    public List() {
        this.values = (T[]) new Object[10];
        this.firstFreeIndex = 0;
    }

    public void add(T value) {
        if (this.firstFreeIndex == this.values.length)
            grow();

        this.values[this.firstFreeIndex] = value;
        this.firstFreeIndex++;
    }

    private void grow() {
        int newSize = this.values.length * 3 / 2;
        T[] newValues = (T[]) new Object[newSize];
        for (int i = 0; i < this.values.length; i++) {
            newValues[i] = this.values[i];
        }

        this.values = newValues;
    }

    public boolean contains(T value) {
        for (int i = 0; i < values.length; i++) {
            if (this.values[i] != null && this.values[i].equals(value))
                return true;
        }

        return false;
    }

    public static void main(String[] args) {
        List<String> strings = new List<>();

        System.out.println(strings.contains("hello"));
        strings.add("hello");
        System.out.println(strings.contains("hello"));

    }
}
