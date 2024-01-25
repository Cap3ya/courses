public class Pet {
    private String name;
    private String breed;

    public Pet(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String toString() {
        return this.name + " (" + this.breed + ")";
    }
}
