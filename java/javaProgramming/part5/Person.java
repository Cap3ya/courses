public class Person {
    private String name; 
    private Pet pet; 

    public Person(String name, Pet pet) {
        this.name = name; 
        this.pet = pet; 
    }

    public String toString() {
        return this.name + ", has a friend " + this.pet; 
    }
}
