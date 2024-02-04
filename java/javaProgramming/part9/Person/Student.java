public class Student extends Person {
    private int credits;

    public Student(String name, String address) {
        super(name, address);
        this.credits = 0; 
    }

    public String credits() {
     return Integer.toString(this.credits);
    }

    public void study() {
        this.credits += 1; 
    }

    public String toString() {
        return super.toString() + "\n\tStudy credits " + this.credits; 
    }
}
