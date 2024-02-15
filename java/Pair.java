public class Pair<T, K> {
    private T first;
    private K second; 

    public void setValues(T first, K second) {
        this.first = first; 
        this.second = second; 
    }

    public T getFirst() {
        return this.first; 
    }

    public K getSecond() {
        return this.second; 
    }

    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>(); 
        pair.setValues("Dix", 10);

        System.out.println(
            pair.getFirst() + "\n" + 
            pair.getSecond()
        );
    }
}
