public class Person {
    private String name;
    private int age;
    private int weight; 
    private int heigth;

    public Person(String initialName) {
        this.name = initialName;
        this.age = 0;
        this.heigth = 0;
        this.weight = 0;
    }

    public void setHeight(int newHeight) {
        this.heigth = newHeight; 
    }

    
    public void setWeight(int newWeight) {
        this.weight = newWeight; 
    }

    public double bodyMassIndex() {
        double heightPerHundred = this.heigth / 100.0; 
        return this.weight / (heightPerHundred * heightPerHundred);
    }

    public String toString() {
        return this.name + ", age: " + this.age + " years";
    } // System.out.println(new Person()) // Call the toSring method

    public String getName() {
        return this.name;
    }

    // no one exceeds the age of 30
    public void growOlder() {
        if (this.age < 30) {
            this.age += 1;
        }
    }

    public int returnAge() {
        return this.age;
    }

    public boolean isOfLegalAge() {
        return this.age >= 18;
    }
}
